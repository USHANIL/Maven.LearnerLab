package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        List<Person> personList = new ArrayList<Person>();
        //todo Instructors and Students are singleton classses so created this new class ToTestPeople to test People class methods
        //People people = new People(); //todo this does not work any more as the People class is now abstract and cannot instantiate
        People people = new ToTestPeople();
        Person person1 = new Person(Long.valueOf(1), "Usha");
        Person person2 = new Person(Long.valueOf(2), "Shree");
        Person person3 = new Person(Long.valueOf(3), "Anish");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Assert.assertEquals(3,people.count());

    }

    @Test
    public void findbyId() {
        List<Person> personList = new ArrayList<Person>();
        People people = new ToTestPeople();
        Person person1 = new Person(Long.valueOf(1), "Usha");
        Person person2 = new Person(Long.valueOf(2), "Shree");
        Person person3 = new Person(Long.valueOf(3), "Anish");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person expPerson = people.findbyId(2);
        Assert.assertEquals(person2, expPerson);
    }

    @Test
    public void remove() {
        List<Person> personList = new ArrayList<Person>();
        People people = new ToTestPeople();
        Person person1 = new Person(Long.valueOf(1), "Usha");
        Person person2 = new Person(Long.valueOf(2), "Shree");
        Person person3 = new Person(Long.valueOf(3), "Anish");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.remove(person1);
        Assert.assertEquals(2,people.count());
    }

    @Test
    public void remove1() {
        List<Person> personList = new ArrayList<Person>();
        People people = new ToTestPeople();
        Person person1 = new Person(Long.valueOf(1), "Usha");
        Person person2 = new Person(Long.valueOf(2), "Shree");
        Person person3 = new Person(Long.valueOf(3), "Anish");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.remove(2);
        Assert.assertEquals(2,people.count());
    }
}