package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testgetInstance() {
        Instructors instructors = Instructors.getInstance();
        Instructor instructor1= new Instructor(6L, "instr1");
        instructors.add(instructor1);
        Integer expected = 6;
        Integer actual = instructors.count();
        Assert.assertEquals(expected, actual);
    }
}
