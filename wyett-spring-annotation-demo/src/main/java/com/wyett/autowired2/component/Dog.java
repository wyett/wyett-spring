package com.wyett.autowired2.component;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 17:45
 * @description: TODO
 */

public class Dog {

    private Person person;

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person +
                '}';
    }

    @Autowired
    public Dog(Person person) {
        this.person = person;
    }
}
