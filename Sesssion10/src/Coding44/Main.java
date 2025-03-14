package Coding44;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123456789");

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    mobilePhone.printContacts();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Query Contact");
        System.out.println("5. Print Contacts");
        System.out.println("6. Exit");
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        if (mobilePhone.addNewContact(Contact.createContact(name, phone))) {
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact already exists.");
        }
    }

    private static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();

        if (mobilePhone.updateContact(oldContact, Contact.createContact(newName, newPhone))) {
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Update failed.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String removeName = scanner.nextLine();
        Contact contactToRemove = mobilePhone.queryContact(removeName);
        if (contactToRemove == null) {
            System.out.println("Contact not found.");
        } else {
            mobilePhone.removeContact(contactToRemove);
            System.out.println("Contact removed successfully.");
        }
    }

    private static void queryContact() {
        System.out.print("Enter contact name to search: ");
        String searchName = scanner.nextLine();
        Contact foundContact = mobilePhone.queryContact(searchName);
        if (foundContact != null) {
            System.out.println("Found: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}
