package com.company;

public class OOP {

    public static void main (String[] args){
        final  float pi = 3.14f;
        Person.summ = 23;
        Person maks = new Person(180, 78.4f);

        System.out.println(Person.summ);
        Person.write("Your number is: ");

        maks.say ("Hi, I'm Maks!");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight = 96.7f;

        System.out.println(oleg.height);

        Student vova = new Student(170, 98f, 3);
        System.out.println(vova.height);

    }

}
