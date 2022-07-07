package com.company.lesson1.ClassWork;

public class Monster {
    private MonsterType type;
    private String name;
    private int health;

    public enum MonsterType {
        Dragon,
        Orc,
        Slime,
        MAX_MONSTER_TYPES,

    }

    Monster(String name, int health, MonsterType type) {
        this.health = health;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("The %s has %d health points", name, health);
    }


    public static void main(String[] args) {
        Monster [] monsters = new Monster[3];
        M


    }
}