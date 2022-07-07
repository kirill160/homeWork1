package com.company.lesson1.ClassWork;

import com.company.lesson1.ClassWork.Monster.MonsterType;

import java.util.Random;

public class MonsterGenerator {
    public static Monster generateMonster(){
       Monster randomMonster = new Monster("MAX_MONSTER_TYPES",getRandomNumber(0,100),MonsterType.MAX_MONSTER_TYPES);
        Random random = new Random();
        int numberOfMonster = random.nextInt(2);
        if (numberOfMonster == 0){
            randomMonster = new Monster("Dragon", getRandomNumber(0,100), MonsterType.Dragon);
            return randomMonster;
        }else if (numberOfMonster == 1){
            randomMonster = new Monster("Orc", getRandomNumber(0,100), MonsterType.Orc);
            return randomMonster;
        }else if(numberOfMonster == 2){
            randomMonster = new Monster("Slime",  getRandomNumber(0,100),MonsterType.Slime);
            return randomMonster;
        }

        return randomMonster;
    }

    public static int getRandomNumber(int min, int max) {
        int randomNumber =(int) (min + Math.random() * max);
        return randomNumber;

    }
}
