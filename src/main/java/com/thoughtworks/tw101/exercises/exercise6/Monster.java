package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by samanthastilson on 09/02/2016.
 */
public interface Monster {
    int hitPoints = 0;

    void takeDamage(int amount);
    void reportStatus();
}
