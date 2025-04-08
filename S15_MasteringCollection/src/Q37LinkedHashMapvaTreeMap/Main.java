package Q37LinkedHashMapvaTreeMap;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {

        Course jmc = new Course("jmc101", "Java Master Class", "Java");
        Course python = new Course("pyt101", "Python Master Class",
                "Python");

        addPurchase("Mary Martin", jmc, 129.99);
        addPurchase("Andy Martin", jmc, 139.99);
        addPurchase("Mary Martin", python, 149.99);
        addPurchase("Joe Jones", jmc, 149.99);
        addPurchase("Bill Brown", python, 119.99);

        addPurchase("Chuck Cheese", python, 119.99);
        addPurchase("Davey Jones", jmc, 139.99);
        addPurchase("Eva East", python, 139.99);
        addPurchase("Fred Forker", jmc, 139.99);
        addPurchase("Greg Brady", python, 129.99);
        System.out.println("-----------Liet ke----------");

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));

        students.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("-----------Đóng------------");

        NavigableMap<LocalDate,List<Purchase>> datedPurchases = new TreeMap<>();// ngày mua

        for (Purchase p : purchases.values() ) {
            datedPurchases.compute(p.purchaseDate(),
                    (pdate, plist) -> {
                        List<Purchase> list =
                                (plist == null) ? new ArrayList<>() : plist;
                        list.add(p);
                        return list;
                    });
        }

        System.out.println("------------------------in ngày mua---------------------");
        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

        int currentYear = LocalDate.now().getYear();

        LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
        LocalDate week1 = firstDay.plusDays(7);
        Map<LocalDate, List<Purchase>> week1Purchases = datedPurchases.headMap(week1);
        Map<LocalDate, List<Purchase>> week2Purchases = datedPurchases.tailMap(week1);


        displayStats(1, week1Purchases);
        displayStats(2, week2Purchases);

        System.out.println("---------// duyệt gần nhất về qkhu--------------");

        LocalDate lastDate = datedPurchases.lastKey();// return KEY
        var previousEntry = datedPurchases.lastEntry();// return KEY-VALUE

        while (previousEntry != null) {
            List<Purchase> lastDaysData = previousEntry.getValue();// Get value ngày gần nhất
            System.out.println(lastDate + " purchases : " + lastDaysData.size());// in

            LocalDate prevDate = datedPurchases.lowerKey(lastDate);// lấy key gần nhất sau lastkey
            previousEntry = datedPurchases.lowerEntry(lastDate);// trả về key bé hơn or null
            lastDate = prevDate;// cập nhật
        }

        System.out.println("---------duyệt xa nhất về gần nhất------------");
        var reversed = datedPurchases.descendingMap(); // tạo tt đảo ngược

        LocalDate firstDate = reversed.firstKey();
//        var nextEntry = reversed.firstEntry();
        var nextEntry = reversed.pollFirstEntry();

        while (nextEntry != null) {
            List<Purchase> lastDaysData = nextEntry.getValue();
            System.out.println(firstDate + " purchases : " + lastDaysData.size());

            LocalDate nextDate = reversed.higherKey(firstDate);
//            nextEntry = reversed.higherEntry(firstDate);
            nextEntry = reversed.pollFirstEntry();
            firstDate = nextDate;
        }
        System.out.println("-----------------------");
        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static void addPurchase(String name, Course course, double price) {

        Student existingStudent = students.get(name);
        if (existingStudent == null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1, 15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(),
                existingStudent.getId(), price, year, day);
        purchases.put(key, purchase);
    }

    private static void displayStats(int period,
                                     Map<LocalDate, List<Purchase>> periodData) {

        System.out.println("-----------------------");
        Map<String, Integer> weeklyCounts = new TreeMap<>();
        periodData.forEach((key, value) -> {
            System.out.println(key + ": " + value);
            for (Purchase p : value) {
                weeklyCounts.merge(p.courseId(), 1, (prev, current)-> prev + current);

            }
        });
        System.out.printf("Week %d Purchases = %s%n", period, weeklyCounts);
    }
}
