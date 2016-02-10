package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by samanthastilson on 09/02/2016.
 */
public class Orc implements Monster{
    int hitPoints = 20;

    public void takeDamage(int amount) {
        hitPoints -= amount;
    }
    public void reportStatus() {
        System.out.println("Orc status is : " + hitPoints + " hit points");
    }

}
