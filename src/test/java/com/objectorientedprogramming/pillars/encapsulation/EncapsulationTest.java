package com.objectorientedprogramming.pillars.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Encapsulation - Encapsulamento: Esconde os atributos da classe, somente a própria classe tem acesso aos atributos dela.
 * Isso adiciona segurança à aplicação, já que toda a lógica é mantida em particular dentro da classe.
 * Outros objetos terão acesso somente a lista de métodos expostos.
 */
public class EncapsulationTest {

    /**
     * Deve ser testado a lógica para parâmetros válidos.
     */
    @Test
    public void testParamsEqualsNull() {
        final RuntimeException expectedException = new RuntimeException("Cannot be null");

        final Exception actualException = Assertions.assertThrows(RuntimeException.class, () -> {
            new Calculator(null, null);
        });

        Assertions.assertTrue(actualException.getClass().isInstance(expectedException));
        Assertions.assertEquals(expectedException.getMessage(), actualException.getMessage());
    }

    /**
     * Deve ser testado a lógica para divisão por zero.
     */
    @Test
    public void testDivideByZero() {
        final RuntimeException expectedException = new RuntimeException("Cannot divide by zero");

        final Exception actualException = Assertions.assertThrows(RuntimeException.class, () -> {
            final Calculator calculator = new Calculator(BigDecimal.ONE, BigDecimal.ZERO);
            calculator.divide();
        });

        Assertions.assertTrue(actualException.getClass().isInstance(expectedException));
        Assertions.assertEquals(expectedException.getMessage(), actualException.getMessage());
    }

    /**
     * Deve ser testado a lógica para divisão por zero.
     */
    @Test
    public void testResultEqualsNull() {
        final RuntimeException expectedException = new RuntimeException("Cannot be null");

        final Exception actualException = Assertions.assertThrows(RuntimeException.class, () -> {
            final Calculator calculator = new Calculator(BigDecimal.ONE, BigDecimal.ONE);
            calculator.getResult();
        });

        Assertions.assertTrue(actualException.getClass().isInstance(expectedException));
        Assertions.assertEquals(expectedException.getMessage(), actualException.getMessage());
    }

    /**
     * Deve ser testado a lógica para somar.
     */
    @Test
    public void testAdd() {
        final BigDecimal number1 = BigDecimal.ONE;
        final BigDecimal number2 = BigDecimal.TEN;
        final BigDecimal expectedResult = number1.add(number2);

        final Calculator calculator = new Calculator(number1, number2);
        calculator.add();
        final BigDecimal actualResult = calculator.getResult();

        Assertions.assertEquals(0, expectedResult.compareTo(actualResult));
    }

    /**
     * Deve ser testado a lógica para subtrair.
     */
    @Test
    public void testSubtract() {
        final BigDecimal number1 = BigDecimal.ONE;
        final BigDecimal number2 = BigDecimal.TEN;
        final BigDecimal expectedResult = number1.subtract(number2);

        final Calculator calculator = new Calculator(number1, number2);
        calculator.subtract();
        final BigDecimal actualResult = calculator.getResult();

        Assertions.assertEquals(0, expectedResult.compareTo(actualResult));
    }

    /**
     * Deve ser testado a lógica para multiplicar.
     */
    @Test
    public void testMultiply() {
        final BigDecimal number1 = BigDecimal.ONE;
        final BigDecimal number2 = BigDecimal.TEN;
        final BigDecimal expectedResult = number1.multiply(number2);

        final Calculator calculator = new Calculator(number1, number2);
        calculator.multiply();
        final BigDecimal actualResult = calculator.getResult();

        Assertions.assertEquals(0, expectedResult.compareTo(actualResult));
    }

    /**
     * Deve ser testado a lógica para dividir.
     */
    @Test
    public void testDivide() {
        final BigDecimal number1 = BigDecimal.ONE;
        final BigDecimal number2 = BigDecimal.TEN;
        final BigDecimal expectedResult = number1.divide(number2);

        final Calculator calculator = new Calculator(number1, number2);
        calculator.divide();
        final BigDecimal actualResult = calculator.getResult();

        Assertions.assertEquals(0, expectedResult.compareTo(actualResult));
    }

}