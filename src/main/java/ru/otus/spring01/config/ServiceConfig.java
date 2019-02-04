package ru.otus.spring01.config;

import org.springframework.context.annotation.Configuration;
import ru.otus.spring01.modelDao.PersonDao;
import ru.otus.spring01.service.FileService;
import ru.otus.spring01.service.PersonService;
import ru.otus.spring01.service.QuestionService;
import ru.otus.spring01.service.impl.PersonServiceImpl;
import ru.otus.spring01.service.impl.QuestionServiceImpl;

@Configuration
public class ServiceConfig {

    public PersonService personService(PersonDao personDao){return new PersonServiceImpl(personDao);}
    public QuestionService questionService (PersonDao personDao){return new QuestionServiceImpl(personDao);}

}
