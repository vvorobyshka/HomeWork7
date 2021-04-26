package academy.belhard;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person per1 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person per2 = new Person("Olya", "Vorobyova", Gender.FEMALE);
        Person per3 = new Person("Nikita", "Kardymon", Gender.MALE);
        Person per4 = new Person("Liza", "Kardymon", Gender.MALE);
        Person per5 = new Person("Petya", "Petrov", Gender.MALE);

        Person per6 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person per7 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person per8 = new Person("Nikita", "Kardymon", Gender.MALE);
        Person per9 = new Person("Nikita", "Kardymon", Gender.MALE);
        Person per10 = new Person("Petya", "Petrov", Gender.MALE);

        Person per11 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person per12 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person per13 = new Person("Nikita", "Kardymon", Gender.MALE);
        Person per14 = new Person("Nikita", "Kardymon", Gender.MALE);
        Person per15 = new Person("Petya", "Petrov", Gender.MALE);


        List<Person> list1 = new ArrayList<>();
        list1.add(per1);
        list1.add(per2);
        list1.add(per3);
        list1.add(per4);
        list1.add(per5);

        int c = 1;
        int b = 1;

        for(Person item : list1)
        {
            System.out.println(c++ + "." + " " +item);
        }

        System.out.println();
        System.out.println();

        Set<Person> set1 = new HashSet<>();
        set1.add(per6);
        set1.add(per7);
        set1.add(per8);
        set1.add(per9);
        set1.add(per10);

        for(Person item: set1)
        {
            System.out.println(b++ + "." + " " + item);
        }

        System.out.println();
        System.out.println();


        Map<Integer, Person> map1 = new TreeMap<>();
        map1.put(54, per11);
        map1.put(11, per12);
        map1.put(15, per13);
        map1.put(2, per14);
        map1.put(3, per15);


        for(Map.Entry<Integer, Person> a : map1.entrySet())
        {
            System.out.println(a.getKey() + " " + a.getValue());
        }

    }
}
