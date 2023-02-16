import java.util.ArrayList;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Edmar", 15));
        people.add(new Person("Clau", 18));
        people.add(new Person("João", 17));
        people.add(new Person("Eduardo", 15));

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            person.getName().toUpperCase().concat(" Concat:");
            if (people.size() - 1 == people.lastIndexOf(people.get(i))) {
            System.out.println(person);

            }

        }
    }
}
