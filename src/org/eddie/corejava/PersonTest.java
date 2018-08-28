package org.eddie.corejava;

public class PersonTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry", 5000, 1999, 10,1);
        people[1] = new Student("Barry Alen", "Eat Shit");
        Class a = int.class;
        Class b = Integer.class;
        System.out.println(a);
        System.out.println(b);
    }
}
