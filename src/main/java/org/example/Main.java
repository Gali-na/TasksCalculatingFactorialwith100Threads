package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] arryTread = new Thread[100];

        for (int i = 0; i < 100; i++) {
            arryTread[i] = new Thread(new Factorial(i));
        }
        for (int i = 0; i < 100; i++) {
            arryTread[i].start();
            Thread.sleep(300);
        }
    }

}
