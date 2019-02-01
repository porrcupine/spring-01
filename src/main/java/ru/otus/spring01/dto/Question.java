package ru.otus.spring01.dto;

import ru.otus.spring01.modelDao.PersonDao;

/**
 * @author Sergey Kuzhel
 */
public class Question {
    private String text;
    private PersonDao person;

    public String getText() {
        return text;
    }

    public PersonDao getPerson() {
        return person;
    }

    public Question(String text, PersonDao person) {
        this.text = text;
        this.person = person;
    }
}
