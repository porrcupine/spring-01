package ru.otus.spring01.modelDao;

import ru.otus.spring01.dto.Question;
import ru.otus.spring01.service.FileService;
import ru.otus.spring01.service.impl.CsvServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public class QuestionDaoSimple implements QuestionDao {

    public List<Question> makeQuestions(PersonDao person) {
        List<Question> questions = new ArrayList();
        FileService fileService = new CsvServiceImpl();
        for (String q : fileService.read()) {
            questions.add(new Question(q, person));
        }
        return questions;
    }
}
