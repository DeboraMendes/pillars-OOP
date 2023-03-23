package com.objectorientedprogramming.pillars.polymorphism;

import com.objectorientedprogramming.pillars.abstraction.Animal;

/**
 * Responsável por representar um animal do tipo gato.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String emitSound() {
        return "miaumiaumiau";
    }
}
