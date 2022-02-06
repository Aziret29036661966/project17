package com.company;

import com.company.hero;

import java.util.Random;

public class Magical extends hero {
    public Magical(int health, int damage) {

        super(health, damage);
    }

    @Override
    public void UseAbility(hero[] heroes, Boss boss) {
        int isAvailable = new Random().nextInt(2);
        if (isAvailable == 1){
            int damage = new Random().nextInt(101);
            for (hero hero : heroes){
                hero.setDamage(hero.getDamage() + damage);
            }
            System.out.println("Magical boosted heroes damage on - " + damage);
        } else {

        }

    }
}
