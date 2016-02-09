package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    int count;

    Accumulator() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public Integer total() {
        return count;
    }
}
