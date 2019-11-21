package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void teachTest() {
        Student student1 = new Student(Long.MIN_VALUE, "Usha");
        double expecterNoOfHrs = 15.5;
        Instructor instructor = new Instructor(Long.MIN_VALUE, "Anil");
        instructor.teach(student1,expecterNoOfHrs);
        double actualNoOfHrs = student1.getTotalStudyTime();
        Assert.assertEquals(expecterNoOfHrs,actualNoOfHrs,1);
    }

    @Test
    public void lectureTest() {
        Student student1 = new Student(Long.MIN_VALUE, "Usha");
        Student student2 = new Student(Long.MIN_VALUE, "Shree");
        Student student3 = new Student(Long.MIN_VALUE, "Anish");
        Student[] students = {student1,student2,student3};
        double noOfHrs = 15.0;
        double expectedNoOfHrs = 15.0/3;
        Instructor instructor = new Instructor(Long.MIN_VALUE, "Anil");
        instructor.lecture(students,noOfHrs);
        double actualNoOfHrs = student1.getTotalStudyTime();
        Assert.assertEquals(expectedNoOfHrs,actualNoOfHrs,1);
    }

    @Test
    public void testImplementationTeacher(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Instructor instructor = new Instructor(expectedId, expectedName);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testExtendsPerson(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Instructor instructor = new Instructor(expectedId, expectedName);
        Assert.assertTrue(instructor instanceof Person);
    }

}
