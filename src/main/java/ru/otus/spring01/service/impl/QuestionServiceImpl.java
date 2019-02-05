package ru.otus.spring01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.spring01.dto.Question;
import ru.otus.spring01.modelDao.QuestionDao;
import ru.otus.spring01.service.QuestionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sergey Kuzhel
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    private  List<Question> questions;
    private  QuestionDao dao;
    private  List<String> answers = new ArrayList<String>() ;

    @Autowired
    public QuestionServiceImpl(QuestionDao questionDao) {
        this.dao = questionDao;
    }

    public void askAnswers() {
        System.out.println("Hello give us a couple of answers");
        Scanner sc = new Scanner(System.in);
        String answer;
        questions = dao.makeQuestions();
        for (Question q : questions) {
            System.out.println(q.getText());
            answer = sc.nextLine();
            answers.add(answer);
        }
        sc.close();
    }

    public void showAnswers() {
        System.out.println("test result: ");
        System.out.println(answers);
    }
}
