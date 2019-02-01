package ru.otus.spring01.modelDao;

import ru.otus.spring01.dto.Question;

import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public interface QuestionDao {
    List<Question> makeQuestions(PersonDao person);
}
