package Q25andQ28_29;

import java.util.*;

public class TreeSetMain {

    public static void main(String[] args) {

        // Lấy danh sách các liên hệ từ dữ liệu có sẵn (danh bạ điện thoại và email)
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        // Comparator để sắp xếp Contact theo tên
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);

        // Tạo một TreeSet sắp xếp theo Comparator (theo tên)
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones); // Thêm danh bạ điện thoại vào TreeSet
        sorted.forEach(System.out::println); // In ra danh sách đã sắp xếp

        // Tạo một TreeSet chỉ chứa tên liên hệ (dạng String)
        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(s -> justNames.add(s.getName())); // Lấy danh sách tên từ danh bạ điện thoại
        System.out.println(justNames); // In ra danh sách tên đã sắp xếp

        // Thêm danh bạ email vào danh sách sorted (Tạo một tập hợp mới để giữ cả email và phone)
        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        System.out.println("--------------fullSet---------------");
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println); // In danh sách liên hệ đã hợp nhất

        // Tạo danh sách ArrayList từ hai tập hợp điện thoại và email
        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);

        // Sắp xếp danh sách đầy đủ theo Comparator của sorted
        fullList.sort(sorted.comparator());
        System.out.println("--------------------------");
        fullList.forEach(System.out::println); // In danh sách sau khi sắp xếp

        // Tìm phần tử nhỏ nhất và lớn nhất theo Comparator trong TreeSet
        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullSet, fullSet.comparator());

        // Lấy phần tử đầu tiên và cuối cùng từ TreeSet
        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println("--------------------------");
        System.out.printf("min = %s, first=%s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last=%s %n", max.getName(), last.getName());
        System.out.println("--------------------------");

        // Tạo một bản sao của fullSet
        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);

        // Lấy và xóa phần tử đầu tiên và cuối cùng trong TreeSet
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());

        // In lại danh sách sau khi đã xóa phần tử đầu và cuối
        System.out.println("---------------saukhixoa------------------");
        copiedSet.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        //Q29
        // NavigableSet advance
        Contact daffy = new Contact("Daffy Duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("Snoopy");
        Contact archie = new Contact("Archie");

        // (ceiling) (higher)
        for (Contact c : List.of(daffy, daisy, last, snoopy)) {
            System.out.printf("ceiling(%s)=%s%n", c.getName(), fullSet.ceiling(c));
            System.out.printf("higher(%s)=%s%n", c.getName(), fullSet.higher(c));
        }
        System.out.println("--------------------------");

        //  (floor) (lower)
        for (Contact c : List.of(daffy, daisy, first, archie)) {
            System.out.printf("floor(%s)=%s%n", c.getName(), fullSet.floor(c));
            System.out.printf("lower(%s)=%s%n", c.getName(), fullSet.lower(c));
        }
        System.out.println("--------------------------");

        // Sắp xếp danh bạ theo thứ tự giảm dần
        NavigableSet<Contact> descendingSet = fullSet.descendingSet();//descendingSet
        descendingSet.forEach(System.out::println);
        System.out.println("--------------------------");

        // Xóa phần tử cuối cùng trong tập hợp giảm dần
        Contact lastContact = descendingSet.pollLast();
        System.out.println("Removed " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println("--------------------------");

        // In lại fullSet để kiểm tra danh sách không bị thay đổi
        fullSet.forEach(System.out::println);
        System.out.println("--------------------------");

        // Lấy danh sách từ phần đầu đến "Maid Marion"
        Contact marion = new Contact("Maid Marion");
        var headSet = fullSet.headSet(marion, true);//headSet
        headSet.forEach(System.out::println);
        System.out.println("--------------------------");

        // Lấy danh sách từ "Maid Marion" trở đi (loại bỏ chính nó)
        var tailSet = fullSet.tailSet(marion, false);
        tailSet.forEach(System.out::println);
        System.out.println("--------------------------");

        // Lấy danh sách con giữa "Linus Van Pelt" và "Maid Marion"
        Contact linus = new Contact("Linus Van Pelt");
        var subset = fullSet.subSet(linus, false, marion, true);
        subset.forEach(System.out::println);
    }
}
