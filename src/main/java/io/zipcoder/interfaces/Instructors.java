package io.zipcoder.interfaces;

import java.lang.reflect.Array;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();
    private String[] instructorNames = {"Kris", "Dolio","Froilan","Chris","Rob"};
    //https://www.geeksforgeeks.org/singleton-class-java/
    private Instructors() {

        for (int i = 0; i < instructorNames.length ; i++) {
            Instructor instructor1= new Instructor(i+1L, instructorNames[i]);
            super.add(instructor1);

        }
    }

    static Instructors getInstance() {
       /* if (INSTANCE == null) {
            INSTANCE.add(new Instructor(3L, ""));
        } */
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
       /* code moved from People Class after making the toArray method abstract
        if(personList.size() == 0)
            return null;
        //return (E[])personList.toArray();
        return personList.toArray((E[]) Array.newInstance(
                personList.get(0).getClass(), personList.size())); */

        if(personList.size() == 0)
            return null;
       return personList.toArray((Instructor[]) Array.newInstance(
                personList.get(0).getClass(), personList.size()));

    }
}
