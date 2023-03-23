package com.objectorientedprogramming.pillars.inheritance;

import com.objectorientedprogramming.pillars.abstraction.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Inheritance - Herança: Permite a criação de classes a partir de classes existentes.
 * Superclasses são mais genéricas e subclasses são mais especificas.
 * As subclasses herdam todas as características e comportamentos da superclasses.
 * Por conta disso, a herança possibilita um grande reaproveitamento de código.
 */
public class InheritanceTest {

    /**
     * Classe concreta Dog que herda da classe abstrata Animal.
     * Deve ser testado se a entidade cachorro tem a característica nome e o comportamento emitir som igual a auauau.
     */
    @Test
    public void test() {
        final String expectedName = "Pluto";
        final String expectedSound = "auauau";

        Animal dog = new Dog(expectedName);

        Assertions.assertEquals(expectedName, dog.getName());
        Assertions.assertEquals(expectedSound, dog.emitSound());
    }

}