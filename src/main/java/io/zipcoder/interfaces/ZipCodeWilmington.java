package io.zipcoder.interfaces;

import java.util.Arrays;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static final Students students = Students.getInstance();
    private static final Instructors instructors =  Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
    public static void hostLecture (Teacher teacher, double numberOfHours) {
        //casting the student to Learner before extending the Person class
     // teacher.lecture((Learner[])students.getInstance().toArray(), numberOfHours);
        //todo casting not required after extending the Person class
        teacher.lecture(students.getInstance().toArray(), numberOfHours);
    }

    public static void hostLecture (long id, double numberOfHours) {
        //Instructor instr = (Instructor) instructors.findbyId(id); //todo even here casting not required anymore
        Instructor instr = instructors.findbyId(id);
        //casting the student to Learner before extending the Person class
        //instr.lecture((Learner[])students.getInstance().toArray(), numberOfHours);
        //todo casting not required after extending the Person class
        instr.lecture(students.getInstance().toArray(), numberOfHours);
    }
}
