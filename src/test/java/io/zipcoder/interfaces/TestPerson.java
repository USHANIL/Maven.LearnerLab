package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void TestConstructor(){
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getId() {
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void getName() {
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "Usha";
        Person person = new Person(expectedId, expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setName() {
        Long expectedId = Long.MIN_VALUE;
        String expectedName = "";
        Person person = new Person(expectedId, expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
        expectedName = "Usha";
        person.setName(expectedName);
        actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);

    }
}
