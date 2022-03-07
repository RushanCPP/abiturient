package com.example.abiturient.education;

public class Olympiad {
    private String name;
    private int level;
    private int bonus;  // Если стопроцентное поступление то bonus = 1'000'000
                        // ---- просто бонус к баллам, то bonus = 10;
    public Olympiad(String name, int level, int bonus) {
        this.name = name;
        this.level = level;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
