package com.objectorientedprogramming.pillars.polymorphism;

import com.objectorientedprogramming.pillars.abstraction.Animal;

/**
 * Responsável por representar um animal do tipo cobra.
 */
public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String emitSound() {
        return "ssssss";
    }
}
