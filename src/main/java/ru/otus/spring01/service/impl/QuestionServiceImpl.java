package ru.otus.spring01.service.impl;

import ru.otus.spring01.dto.Question;
import ru.otus.spring01.modelDao.PersonDao;
import ru.otus.spring01.modelDao.QuestionDao;
import ru.otus.spring01.modelDao.QuestionDaoSimple;
import ru.otus.spring01.service.QuestionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sergey Kuzhel
 */
public class QuestionServiceImpl implements QuestionService {
    QuestionDao questionDao = new QuestionDaoSimple();
    private  List<Question> questions;
    private  List<String> answers = new ArrayList<String>() ;

    public void AskAnswers() {
        System.out.println("Hello give us a couple of answers");
        Scanner sc = new Scanner(System.in);
        String answer;
        for (Question q : questions) {
            System.out.println(q.getText());
            answer = sc.nextLine();
            answers.add(answer);
        }
    }

    public QuestionServiceImpl(PersonDao person) {
        this.questions = questionDao.makeQuestions(person) ;
    }

    public void ShowAnswers() {
        System.out.println("test result: ");
        System.out.println(answers);
    }
}
