package person;

import org.w3c.dom.DOMImplementationSource;

public class Person implements Comparable<Person> {
    private String name;
    public Person(String name){
       this.name = name;

    }
    public String getName(){
        return name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o .name);
    }
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
