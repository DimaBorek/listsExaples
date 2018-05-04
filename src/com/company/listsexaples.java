package com.company;

import person.Person;

import java.util.*;

public class listsexaples {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
String nick = "Nick";
String ivan = "Ivan";
String vasily = "Vasily";
names.add(nick);
names.add(ivan);
names.add(vasily);
soutListOfStrings(names);
names.add("Stepan");
if(names.contains("Ivan")){
    System.out.println("Hello Ivan");
}
        System.out.println(names.size());
        System.out.println(names.get(3));
        System.out.println(names.remove(2));
        System.out.println(names.remove("Dmitry"));
    //System.out.println(names.get(123));
names.add("kirill");
for (String name:names  ){
if(name.equals(name)){
names.remove(name);
}
    System.out.println(name);
}
names.add(0,"Eugene");
        names.set(0,"Peter");
        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add(nick);
        linkedNames.add(ivan);
        linkedNames.add(vasily);
        linkedNames.addFirst("Olga");
        linkedNames.offerFirst("helga");
        soutListOfStrings(linkedNames);
        linkedNames.remove();
        soutListOfStrings(linkedNames);
        LinkedHashSet<Person>linkedPersons = new LinkedHashSet<>();




}


    public static void soutListOfStrings(List<String> list) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println();
        }
        private static void soutSet(Set set){
        for (Object s : set){
            System.out.println(s);

        }
            System.out.println();
        }
}