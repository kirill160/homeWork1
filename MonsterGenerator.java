package com.company.lesson1.ClassWork;

import static com.company.lesson1.ClassWork.Monster.MonsterType.Dragon;

public class MonsterGenerator {
    private static Monster generateMonster(){
        Monster dragon = new Monster("Dragon", 100, Monster.MonsterType.valueOf("Dragon"));
        return dragon;
    }

    public static double getRandomNumber(int min, int max) {
        double randomNumber = min + Math.random() * max;
        return randomNumber;

    }
}
