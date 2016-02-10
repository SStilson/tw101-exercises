package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by samanthastilson on 09/02/2016.
 */
public class Troll implements Monster{
    int hitPoints = 40;

    public void takeDamage(int amount) {
        hitPoints -= amount/2;

    }
    public void reportStatus() {
        System.out.println("Troll status is : " + hitPoints + " hit points");
    }

}
