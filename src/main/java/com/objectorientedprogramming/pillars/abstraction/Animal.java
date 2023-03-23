package com.objectorientedprogramming.pillars.abstraction;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Responsável por representar um animal.
 */
@Getter
@AllArgsConstructor
public abstract class Animal {

    public String name;

    public abstract String emitSound();

}
