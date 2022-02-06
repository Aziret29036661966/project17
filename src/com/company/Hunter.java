package com.company;

import com.company.hero;

import java.util.Random;

public class Hunter extends hero {
    public Hunter(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void UseAbility(hero[] heroes, Boss boss) {
        int isAvailable = new Random().nextInt(2);
        if (isAvailable == 1){
            final int min = 50;
            final int max = 100;
            final int randomDamage = new Random().nextInt((max - min) + 1) + min;
            this.damage = this.damage + randomDamage;
            System.out.println("Hunter boosted his damage on: " + randomDamage);
        }else {

        }
    }
}
