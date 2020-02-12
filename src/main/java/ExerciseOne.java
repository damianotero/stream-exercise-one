
//  Exercise one

// Create Person object with 3 fields : Name, Nationality, Age
// Create a List of Person
// Get the average age of a nationality

//  Use streams only

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne{

    private List<Person> personList;

    public ExerciseOne() {
        this.personList = new ArrayList<>();
        addPersons();
    }

    public double getAverageAgeOf(String nationality) {

        return personList.stream()
                .filter(person -> person.getNationality().equals(nationality))
                .mapToInt(Person::getAge)
                .average().getAsDouble();
    }

    private void addPersons() {
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