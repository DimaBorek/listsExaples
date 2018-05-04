package person;

import sun.awt.image.IntegerComponentRaster;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {


    HashSet<String> names = new HashSet<>();
    String nick = "Nick";
    String ivan = "Ivan";
    String vasily = "Vasily";
    names.add(nick);
    names.add(ivan);
    names.add(vasily);
    names.add("Ivan");soutSet(names);
    Person nickPerson = new Person("Nick");
    Person nickPerson2 = new Person("Nick");
    Person ivanPerson = new Person("Ivan");
    HashSet<Person> persons = new HashSet<>();
    persons.add(nickPerson);
    persons.add(nickPerson2);
    persons.add(ivanPerson);
soutSet(persons);
        LinkedHashSet<Person> linkedPersons = new LinkedHashSet<>();
        linkedPersons.add(nickPerson);
        linkedPersons.add(nickPerson2);

        linkedPersons.add(ivanPerson);
        linkedPersons.add(new Person("Vlad"));
        soutSet(linkedPersons);
        TreeSet<Person> treePerson = new TreeSet<>();
        treePerson.add(nickPerson);
        treePerson.add(nickPerson2);
        treePerson.add(ivanPerson);
        System.out.println(treePerson);

        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1,Person o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };
        TreeSet anotherTreePersons = new TreeSet<>(personComparator);
        anotherTreePersons.add(new Person("Stepan",50));
        anotherTreePersons.add(new Person("Ignat",15));
        anotherTreePersons.add(new Person("Svetlana",30));
        soutSet(anotherTreePersons);

HashMap<Integer,String> persons = new HashMap<>();
persons.put(1,"Ivan");
persons.put(2,"Stepan");
String name = persons.get(0110);



}   private static void soutSet(Set set) {
        for (Object s : set) {
            System.out.println(s);

        }
        System.out.println();
    }


}
