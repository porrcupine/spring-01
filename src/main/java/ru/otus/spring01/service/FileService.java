package ru.otus.spring01.service;

import java.io.BufferedReader;
import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public interface FileService {

    List<String> read();

    void write();
}
