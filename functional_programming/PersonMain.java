package functional_programming;

import java.util.List;

public class PersonMain {
    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 32),
                new Person("Paula", 32),
                new Person("Paul", 30),
                new Person("Jack", 28),
                new Person("Juli", 40)
            );
    }

    public static void main(String[] args) {

        //print the names, in uppercase, of those who are older than 0
        //functional - pipeline of functions
        //Unix pipelines
        //filter|map|reduce

        createPeople().stream()
                .filter(person -> person.getAge()>30)
                .map(person -> person.getName())
                .map(name -> name.toUpperCase())
               // .map(name -> name.toLowerCase())
                .forEach(name -> System.out.println(name));
        //in every line  focus on  one single level of abstraction
    }
}
