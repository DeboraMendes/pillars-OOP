package com.objectorientedprogramming.pillars.inheritance;

import com.objectorientedprogramming.pillars.abstraction.Animal;

/**
 * Responsável por representar um animal do tipo cachorro.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String emitSound() {
        return "auauau";
    }
}
