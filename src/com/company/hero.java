package com.company;

import com.company.GameEntity;

public abstract class hero extends GameEntity implements IAbility {
    public hero(int health, int damage) {

        super(health, damage);
    }
}
