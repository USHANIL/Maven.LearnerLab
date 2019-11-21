package io.zipcoder.interfaces;

import java.lang.reflect.Array;

public final class  Students extends People<Student> {
   private static final Students INSTANCE = new Students();
//https://www.geeksforgeeks.org/singleton-class-java/
    private Students() {
        for (long i = 0; i < 35; i++) {
            Student s1= new Student(i+1L, "stud"+i);
            add(s1);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        if(personList.size() == 0)
            return null;
        //return (Student[])personList.toArray();
        return personList.toArray((Student[]) Array.newInstance(
                personList.get(0).getClass(), personList.size()));
    }


}
