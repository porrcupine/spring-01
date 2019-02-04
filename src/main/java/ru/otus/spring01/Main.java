package ru.otus.spring01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring01.dto.Person;
import ru.otus.spring01.service.PersonService;
import ru.otus.spring01.service.QuestionService;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        PersonService s = context.getBean(PersonService.class);
        QuestionService qs = context.getBean(QuestionService.class);
        Person ivan = s.getByName("ivan", "petrov");
        System.out.println("name: " + ivan.getName() + " surname: " + ivan.getSurname() + " age: " + ivan.getAge());
        qs.askAnswers();
        qs.showAnswers();
    }
}
