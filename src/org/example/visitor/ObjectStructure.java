package org.example.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-18 14:44
 **/
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
