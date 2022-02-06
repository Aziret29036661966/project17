package com.company;

public class RpgGame {
    private static void printStatistics(hero heroes[], Boss boss) {
        System.out.println("---------------------");
        System.out.println("Boss health " + boss.getHealth());
        for (hero hero : heroes
        ) {
            System.out.println(hero.getClass().getSimpleName() + "Current Health " + hero.getHealth());
        }
        System.out.println("---------------------");
    }

    private static void heroesHits(hero heroes[], Boss boss) {
        for (hero hero : heroes
        ) {
            System.out.println("hitTrain");
            int heroDamage = hero.getDamage();
            boss.damage(heroDamage);
            System.out.println(hero.getClass().getSimpleName() + "Attack Boss on -" + heroDamage);

        }

    }

    private static void BossHits(hero heroes[], Boss boss) {
        for (hero hero : heroes
        ) {
            System.out.println("hitTrain");
            int bossDamage = boss.getDamage();
            heroesHits(bossDamage);
            System.out.println(hero.getClass().getSimpleName() + "Attack Heroes on -" + bossDamage);

        }

    }

    private static void heroesHits(int bossDamage) {
    }

    private static boolean ifFinish(hero[] heroess, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;

        }
        boolean allHeroesDead = true;
        for (hero heroes : heroess) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        return allHeroesDead;
    }
private static void round(hero heroes[], Boss boss){
BossHits(heroes,boss);
heroesHits(heroes,boss);
printStatistics(heroes,boss);
    }
    private static hero[] CreateHeroes (){
        hero[] heroes = {};
Hunter hunter = new Hunter(444,600);
Medic medic = new Medic(222,335);
Warrior warrior = new Warrior(434,353);
Magical magical = new Magical(343,543);
hero[] hero = {hunter,medic,warrior,magical};
return hero;

        }
        public static void startGame(){
        hero[] nero = CreateHeroes();
        Boss bosses = new Boss(468,28747);
        printStatistics(nero,bosses);
        while (!ifFinish(nero,bosses));
        round(nero,bosses);
        }
    }

