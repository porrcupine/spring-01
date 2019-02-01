package ru.otus.spring01.service;

import ru.otus.spring01.dto.Person;

public interface PersonService {

    Person getByName(String name, String surname);
}
