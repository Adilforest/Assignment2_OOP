import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.0);
        Student student1 = new Student("Ringo", "Starr", 2.0);
        Student student2 = new Student("Paul", "McCartney", 3.0);

        ArrayList<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge\n", person.toString(), person.getPaymentAmount());
        }
    }
}