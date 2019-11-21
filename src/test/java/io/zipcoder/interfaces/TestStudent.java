package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void TestConstructor(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Student student = new Student(expectedId, expectedName);
        Long actualId = student.getId();
        String actualName = student.getName();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void TestImplementationLearner(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Student student = new Student(expectedId, expectedName);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void TestExtendsPerson(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Student student = new Student(expectedId, expectedName);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testTotalStudyTime() {
        Student student = new Student(Long.MIN_VALUE, "Usha");
        student.learn(4.5);
        student.learn(4.5);
        Double actual = student.getTotalStudyTime();
        Double expected = 9.0;
        Assert.assertEquals(expected, actual);
    }
}
