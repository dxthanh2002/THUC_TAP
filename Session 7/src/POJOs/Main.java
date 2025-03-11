package POJOs;

public class Main {
public static void main(String[] args) {
    Person person = new Person();
    person.age = 12;
    System.out.println(person.age);
    Person person2 = person;
    person2.age = 13;
    System.out.println(person.age);

}
}
