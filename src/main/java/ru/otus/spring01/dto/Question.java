package ru.otus.spring01.dto;

/**
 * @author Sergey Kuzhel
 */
public class Question {
    private String text;

    public String getText() {
        return text;
    }

    public Question(String text) {
        this.text = text;
    }
}
