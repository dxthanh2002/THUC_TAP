package Q32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        // Lấy danh sách số điện thoại và email từ ContactData
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        // Gộp danh sách số điện thoại và email thành một danh sách chung
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-------------- danh sách chung ---------------");

        // Tạo một HashMap để lưu danh bạ (key: name, value: Contact object)
        Map<String, Contact> contacts = new HashMap<>();

        // Put danh bạ vào Map
        for (Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }

        // In danh bạ sau khi thêm dữ liệu
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("----------List to Map-------------------");

        // Lấy contact theo tên ( .get() )
        System.out.println(contacts.get("Charlie Brown")); // Có tồn tại
        System.out.println(contacts.get("Chuck Brown"));   // Không tồn tại, trả về null

        // Lấy contact, nhưng nếu không có thì trả về một giá trị mặc định
        // Bình thường thì trả vè null, dùng getOrDefault để trả veef mặc định
        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("----------------put-------------");

        // Cách 1: Xử lý dữ liệu trùng lặp bằng `put`
        contacts.clear();
        for (Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
                // Nếu đã có contact trùng tên, hợp nhất dữ liệu
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("------------clear-----------------");

        // Cách 2: Sử dụng `putIfAbsent`
        contacts.clear();
        for (Contact contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact); // Chỉ thêm nếu chưa tồn tại
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-----------putIfAbsent------------------");

        // Cách 3: Kết hợp `putIfAbsent` và merge dữ liệu
        contacts.clear();
        for (Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if (duplicate != null) {
                // Hợp nhất dữ liệu nếu contact đã tồn tại
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-----------------------------");

        // Cách 4: Sử dụng `merge()` để xử lý tự động
        contacts.clear();
        fullList.forEach(contact ->
                contacts.merge(contact.getName(), contact, Contact::mergeContactData)
        );

        // In danh bạ cuối cùng
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        //
         //
         //
         //
         //
         // Q 33
        System.out.println("--------------computeIfAbsent---------------");

// computeIfAbsent: Nếu key không tồn tại, thêm vào Map với giá trị mới
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck",
                "Scrooge McDuck"}) {
            contacts.computeIfAbsent(contactName, k -> new Contact(k));
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("-------------computeIfPresent----------------");

// computeIfPresent: Nếu key đã tồn tại, cập nhật giá trị bằng cách thêm email
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck",
                "Scrooge McDuck"}) {
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun Place"); return v; });
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("---------------replaceAll--------------");

// replaceAll: Cập nhật tất cả email trong danh bạ theo quy tắc mới
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" ", "") + "@funplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("--------------replace---------------");

// replace: Thay thế thông tin của Daisy Duck bằng một đối tượng Contact mới
        Contact daisy = new Contact("Daisy Jane Duck", "daisyj@duck.com");
        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("daisy = " + daisy);
        System.out.println("replacedContact = " + replacedContact);
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("------------replace(key, oldValue, newValue)-----------------");

// replace(key, oldValue, newValue): Thay thế giá trị nếu khớp với oldValue
        Contact updatedDaisy = replacedContact.mergeContactData(daisy);
        boolean success = contacts.replace("Daisy Duck", daisy, updatedDaisy);
        if (success) {
            System.out.println("Successfully replaced element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n"
                    .formatted("Daisy Duck", replacedContact));
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

        System.out.println("------------remove-----------------");

// remove(key, value): Chỉ xóa mục khỏi Map nếu cả key và value đều khớp
        success = contacts.remove("Daisy Duck", daisy);
        if (success) {
            System.out.println("Successfully removed element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n"
                    .formatted("Daisy Duck", daisy));
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));

    }

}