package com.objectorientedprogramming.pillars.polymorphism;

import com.objectorientedprogramming.pillars.abstraction.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Polymorphism - Polimorfismo: Subclasses podem ter ações comuns, porém maneiras diferentes de realiza-las.
 */
public class PolymorphismTest {

    /**
     * Classes concretas de diferentes tipos que herdam da classe abstrata Animal.
     * Deve ser testado se as entidades têm as características e os comportamentos específicos.
     */
    @Test
    public void test() {
        final String expectedCatName = "Tom";
        final String expectedCatSound = "miaumiaumiau";

        Animal cat = new Cat(expectedCatName);

        Assertions.assertEquals(expectedCatName, cat.getName());
        Assertions.assertEquals(expectedCatSound, cat.emitSound());

        final String expectedSnakeName = "Anaconda";
        final String expectedSnakeSound = "ssssss";

        Animal snake = new Snake(expectedSnakeName);

        Assertions.assertEquals(expectedSnakeName, snake.getName());
        Assertions.assertEquals(expectedSnakeSound, snake.emitSound());
    }

}