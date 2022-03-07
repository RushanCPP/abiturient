package com.example.abiturient.database;

import com.example.abiturient.education.University;

public class FakeDataBase {
    public University[] getData() {
        University[] array = new University[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new University();
        }
        return array;
    }
}
