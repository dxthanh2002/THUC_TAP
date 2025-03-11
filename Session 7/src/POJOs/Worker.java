package POJOs;

public class Worker extends Person {
    double salary;

    public Worker(int age, double salary) {
        super(age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", age=" + age +
                '}';
    }
}
