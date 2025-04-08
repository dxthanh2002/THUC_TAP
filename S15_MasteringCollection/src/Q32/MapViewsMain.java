package Q32;

import java.util.*;

public class MapViewsMain {

    public static void main(String[] args) {

        //HashMap
        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        //keysView và copyOfKeys
        Set<String> keysView = contacts.keySet();//HashMap
        System.out.println(keysView);

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());//TreeSet
        System.out.println(copyOfKeys);

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");
        }

        keysView.remove("Daffy Duck");//Xóa "Daffy Duck" khỏi keySet(), sẽ ảnh hưởng trực tiếp đến contacts
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        copyOfKeys.remove("Linus Van Pelt");//Xóa "Linus Van Pelt" khỏi bản sao, không ảnh hưởng đến contacts
        System.out.println(copyOfKeys);
        contacts.forEach((k, v) -> System.out.println(v));

        //Set được return từ keySet cx ảnh hg đến Map và ngc lại
        // dùng dc remove removeAll , retainAll
        // k dùng dc add, addAll
        keysView.retainAll(List.of("Linus Van Pelt","Charlie Brown",
                "Robin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);

         //keysView.add("Linus Van Pelt"); // k dùng dc
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        System.out.println("------------contacts-keysView----------");
        System.out.println(contacts);
        System.out.println(keysView);

        var values = contacts.values();
        values.forEach(System.out::println);

        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("------------------");
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println("------------------");
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        keysView.forEach(System.out::println);

        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if (set.size() < contacts.keySet().size()) {
            System.out.println("Duplicate Values are in my Map");
        }

        var nodeSet = contacts.entrySet();
        System.out.println(nodeSet);
        for (var node : nodeSet) {

            if (!node.getKey().equals(node.getValue().getName())) {

                System.out.println("Key doesn't match name: " + node.getKey() + ": " +
                        node.getValue());
            }
        }

    }
}
