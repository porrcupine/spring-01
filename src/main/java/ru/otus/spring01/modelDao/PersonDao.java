package ru.otus.spring01.modelDao;

import ru.otus.spring01.dto.Person;

public interface PersonDao {

    Person findByName(String name, String surname);
}
