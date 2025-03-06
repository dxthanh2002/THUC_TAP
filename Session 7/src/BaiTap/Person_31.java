package BaiTap;

public class Person_31 {
    private String firstName;
    private String lastName;
    private int age;
    /// //Contructor////
    public Person_31(int age, String lastName, String firstName) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /// Getter Setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "No Name";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }
}
