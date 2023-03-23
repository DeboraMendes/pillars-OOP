package com.objectorientedprogramming.pillars.abstraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Abstraction - Abstração: Se refere a maneira como o mundo real será representado via código.
 * Na abstração é necessários simplificar a complexidade do mundo real de acordo com as necessidades daquilo que o
 * sistema deve realizar.
 * Três pontos precisam ser identificados para definir a estrutura do sistema: A entidade, suas características e
 * comportamentos.
 */
public class AbstractionTest {

    /**
     * Não é possível instanciar uma classe abstrata.
     * Somente classes concretas podem ser instanciadas.
     * O animal precisa ser de um determinado tipo.
     * Nesse caso,
     * Deve ser testado se a entidade animal tem a característica nome e o comportamento emitir som.
     */
    @Test
    public void test() {
        //Animal animal = new Animal();
        Assertions.assertTrue(Arrays.stream(Animal.class.getFields()).anyMatch(field -> field.getName().equals("name")));
        Assertions.assertTrue(Arrays.stream(Animal.class.getMethods()).anyMatch(method -> method.getName().equals("emitSound")));
    }

}