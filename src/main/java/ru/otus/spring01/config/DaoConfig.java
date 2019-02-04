package ru.otus.spring01.config;

import org.springframework.context.annotation.Configuration;
import ru.otus.spring01.modelDao.PersonDao;
import ru.otus.spring01.modelDao.PersonDaoSimple;

@Configuration
public class DaoConfig {

    public PersonDao personDao(){return new PersonDaoSimple();}

}
