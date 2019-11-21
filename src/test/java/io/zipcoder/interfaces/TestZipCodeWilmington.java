package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testhostLecturebyInstructorId() {
        ZipCodeWilmington zipInstance = ZipCodeWilmington.getInstance();
        //Teacher teacher = new Instructor();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        Instructor instructorid = instructors.findbyId(1L);
        double numberOfHours = 35;
        Student student1= students.findbyId(1L);

        zipInstance.hostLecture (instructorid, numberOfHours);

        Assert.assertEquals(1,student1.getTotalStudyTime(),0.01);

    }

    @Test
    public void testhostLecturebyInstructor() {
        //declarations
        ZipCodeWilmington zipInstance = ZipCodeWilmington.getInstance();
        //Teacher teacher = new Instructor();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();

        Instructor instructor = instructors.personList.get(2);
        double numberOfHours = 35;
        Student student1= students.findbyId(1L);

        zipInstance.hostLecture (instructor, numberOfHours);

        Assert.assertEquals(1,student1.getTotalStudyTime(),0.01);
    }



}
