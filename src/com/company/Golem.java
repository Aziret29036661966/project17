package com.company;

import java.util.Random;

public class Golem extends hero {
    public Golem(int health, int damage) {

        super(health, damage);
    }

    @Override
    public void UseAbility(hero[] heroes, Boss boss) {
        int isAvailable = new Random().nextInt(2);
        if (isAvailable == 1){
            int damage = 100;
            if (Golem.getHealth() == 0 && boss.getHealth() == 0){
if (boss.getDamage() == Golem.getHealth()){
    final var i = Boss.getHealth() - damage + boss.getDamage();

}
            }

            {
            }


        }
        }
    }

