package io.zipcoder.interfaces;
import java.lang.reflect.Array;
import java.util.*;

//public class People <E> implements Iterable<E>{
//List<Person> personList = new ArrayList<Person>();

public abstract class People <E extends Person> implements Iterable<E>{
List<E> personList = new ArrayList<E>();

//public void add(Person per) { //todo changed the code to address to type E instead of type Person
public void add(E per) {
personList.add(per);
}

public E findbyId(long id) {
   E person = null;
    for (E per: personList) {
        if (per.getId() == id) {
            person = per;
            break;
        }
    }
    return person;
}

public Boolean contains(E person) {
        return personList.contains(person);
    }

public void remove(E person) {
    if (contains(person))
        personList.remove(person);
    }

public void remove(long id)
    {
        int i=0;
        for (E per:personList) {
            if (per.getId() == id) {
                personList.remove(i);
            }
            i++;
        }
    }

    public void removeAll() {
        this.personList = new ArrayList();
    }

    public int count() {
        return personList.size();
    }

    public abstract E[] toArray() ;

    public Iterator<E> iterator() {
        return (Iterator<E>)personList.iterator(); //todo we may have to change this
    }
}
