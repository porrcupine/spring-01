package ru.otus.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring01.dto.Person;
import ru.otus.spring01.service.PersonService;
import ru.otus.spring01.service.QuestionService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");
        PersonService s = context.getBean(PersonService.class);
        QuestionService qs = context.getBean(QuestionService.class);
        Person ivan = s.getByName("ivan", "petrov");
        System.out.println("name: " + ivan.getName() + " surname: " + ivan.getSurname() + " age: " + ivan.getAge());
        qs.AskAnswers();
        qs.ShowAnswers();
    }
}
