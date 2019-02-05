package ru.otus.spring01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.spring01.modelDao.PersonDao;
import ru.otus.spring01.dto.Person;
import ru.otus.spring01.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao dao;

    @Autowired
    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

//    public void setDao(PersonDao modelDao) {
//        this.modelDao = modelDao;
//    }

    public Person getByName(String name, String surname) {
        return dao.findByName(name, surname);
    }
}
