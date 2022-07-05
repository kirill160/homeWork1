package com.company.lesson1.ClassWork;

public class MonsterGenerator {
    private static Monster generateMonster(){
        return new Monster(Monster.MonsterType.values());
    }

    public static double getRandomNumber(int min, int max) {
        double randomNumber = min + Math.random() * max;
        return randomNumber;

    }
}
