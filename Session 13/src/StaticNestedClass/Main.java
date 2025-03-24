package StaticNestedClass;
import StaticNestedClass.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "JingYuan", 2015),
                new Employee(10005, "Castorice", 2021),
                new Employee(10022, "Aglaea", 2013),
                new Employee(13151, "Clara", 2020),
                new Employee(10050, "Stelle", 2018) ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted")
                .reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
