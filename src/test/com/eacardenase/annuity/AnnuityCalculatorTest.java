package com.eacardenase.annuity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import eacardenase.annuity.AnnuityCalculator;

public class AnnuityCalculatorTest {
    private AnnuityCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new AnnuityCalculator();
    }

    @Test
    public void annuityExample() {
        String result = calculator.calculateAnnuity("22000", 7, "0.06", 1);

        assertEquals("$184,664.43", result);
    }

    @Test
    public void annuityPractice2() {
        String result = calculator.calculateAnnuity("1200", 10, "0.08", 4);

        assertEquals("$72,482.38", result);
    }
}
