package com.objectorientedprogramming.pillars.encapsulation;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Responsável por representar uma calculadora.
 */
@Getter
public class Calculator {

    private final BigDecimal number1;
    private final BigDecimal number2;
    private BigDecimal result;

    public Calculator(final BigDecimal number1, final BigDecimal number2) {
        if (Objects.isNull(number1) || Objects.isNull(number2)) throw new RuntimeException("Cannot be null");
        this.number1 = number1;
        this.number2 = number2;
    }

    public void add() {
        this.result = this.number1.add(number2);
    }

    public void subtract() {
        this.result = this.number1.subtract(number2);
    }

    public void multiply() {
        this.result = this.number1.multiply(number2);
    }

    public void divide() {
        if (BigDecimal.ZERO.compareTo(number2) == 0) throw new RuntimeException("Cannot divide by zero");
        this.result = this.number1.divide(number2);
    }

    public BigDecimal getResult() {
        if (Objects.isNull(result)) throw new RuntimeException("Cannot be null");
        return result;
    }
}