package ru.otus.spring01.modelDao;

import ru.otus.spring01.dto.Person;

public class PersonDaoSimple implements PersonDao {
    private int defaultAge;

    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }

    public Person findByName(String name, String surname) {
        return new Person(name, surname, defaultAge);
    }

}
