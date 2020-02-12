import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();

        addPersons(personList);

        System.out.println(getAverageAgeOf("Spain", personList));
        System.out.println(getAverageAgeOf("UK", personList));
        System.out.println(getAverageAgeOf("Portugal", personList));


    }

    public static double getAverageAgeOf(String nationality, List<Person> personList) {

        return personList.stream()
                .filter(person -> person.getNationality().equals(nationality))
                .mapToInt(Person::getAge)
                .average().getAsDouble();

    }


    private static void addPersons(List<Person> personList) {
        personList.add(new Person("Pepe", "Spain", 32));
        personList.add(new Person("John", "EEUU", 15));
        personList.add(new Person("Ivan", "Russia", 63));
        personList.add(new Person("Maria", "Spain", 33));
        personList.add(new Person("Jose", "Portugal", 12));
        personList.add(new Person("michael", "UK", 22));
        personList.add(new Person("jose manuel", "Spain", 54));
        personList.add(new Person("Robert", "EEUU", 46));
        personList.add(new Person("lucia", "Italy", 54));
        personList.add(new Person("Jack", "UK", 46));
        personList.add(new Person("Manolo", "Spain", 24));
        personList.add(new Person("Josefa", "Portugal", 39));
        personList.add(new Person("Eustaquio", "Portugal", 54));
        personList.add(new Person("Barbara", "EEUU", 88));
    }
}
