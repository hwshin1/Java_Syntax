package org.example;

public class Main {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // println이 아닌 print
            }
            System.out.println(); // 줄바꿈
        }
    }
}
