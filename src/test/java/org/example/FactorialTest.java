package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getNumber_CreateFactoial_GetNumberForСountingFactorial() {
        Factorial factorial = new Factorial(1);
        assertEquals(1, factorial.getNumber());
    }


    @Test
    void calculateFactorial() {
        Factorial factorial = new Factorial(3);
        assertEquals("6", factorial.calculateFactorial());
    }

    @Test
    void run() {
        Factorial factorial = new Factorial(3);
        factorial.run();
        String rezult = factorial.getRezult();
        assertEquals("Thread number " + "3" + "->" + "factorial of thread number " + factorial.calculateFactorial(), rezult);
    }
}