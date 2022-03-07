package com.example.abiturient.education;

public class USE {
    public enum Lesson {
        Russian,
        Physics,
        Math,
        Chemist,
        History,
        ComputerScience,
        Biology,
        SocialStudies,
        Geography,
        OtherLanguages,
        Literature,
        LESSONS_END
    }
    private int[] scores;

    public USE() {
        scores = new int[Lesson.LESSONS_END.ordinal()];
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = 0;
        }
    }

    public void setLesson(Lesson lesson, int score) {
        scores[lesson.ordinal()] = score;
    }

    public int getLesson(Lesson lesson) {
        return scores[lesson.ordinal()];
    }
}
