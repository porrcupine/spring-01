package ru.otus.spring01.service.impl;

import ru.otus.spring01.service.FileService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public class CsvServiceImpl implements FileService {

    public List<String> read() {
        List<String> questionsText = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/questions.csv"));;
            String line = br.readLine();
            while (line != null) {
                questionsText.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questionsText;
    }

    public void write() {


    }
}
