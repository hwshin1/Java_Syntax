package org.example;

public class Main {
    public static void main(String[] args) {
        int num = 32;

        for (int i = 1; i <= num; i++) {
            if (num == 1) {
                System.out.println(num);
            } else if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
