package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    Educator educator1;
    Educator educator2;
    Educator educator3;
    Students students;

    @Before
    public void setUp() throws Exception {
        educator1 = Educator.Chris;
        educator2 = Educator.Kris;
        educator3 = Educator.Dolio;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void teach() {
        educator1.teach(students.getInstance().findbyId(1), 5);
        educator2.teach(students.getInstance().findbyId(1),5);
        Assert.assertEquals( 5, educator1.getTimeWorked());
        Assert.assertEquals( 5, educator2.getTimeWorked());
        Assert.assertEquals( 10, students.getInstance().findbyId(1).getTotalStudyTime(),0.0);
    }

    @Test
    public void lecture() {
        educator1.lecture(students.getInstance().toArray(),35);
        educator2.lecture(students.getInstance().toArray(),35);
        Assert.assertEquals( 35, educator1.getTimeWorked());
        Assert.assertEquals( 35, educator2.getTimeWorked());
        Assert.assertEquals( 2, students.getInstance().findbyId(1).getTotalStudyTime(),0.0);

    }
}