package org.example;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number;
    String rezult;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getRezult() {
        return rezult;
    }

    public String calculateFactorial() {
        BigInteger factorial = new BigInteger(String.valueOf(number));
        for (int i = number - 1; i > 0; i--) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial.toString();
    }

    @Override
    public void run() {
        rezult="Thread number " + number + "->" + "factorial of thread number " + calculateFactorial();
        System.out.println("Thread number " + number + "->" + "factorial of thread number " + calculateFactorial());
    }
}
