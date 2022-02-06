package com.company;

import com.company.hero;

import java.util.Random;

public class Warrior extends hero {
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void UseAbility(hero[] heroes, Boss boss) {
        int isAvailable = new Random().nextInt(2);
        if (isAvailable == 1){
            int criticalDamage = 500;
            if (getHealth() <= 300){
                if (getDamage() >= 600 && getDamage() <= 1000){

                } else {
                    setDamage(getDamage() + criticalDamage);
                    System.out.println("Warrior used his last hit for " + getDamage());
                }
            }
        } else {

        }
    }
}
