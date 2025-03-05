package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 10;

        // 문장 + 숫자 => 숫자는 문장화 됨
        System.out.println("x"); // x
        System.out.println(x); // 10
        System.out.println("x" + x); // x10
        System.out.println("x : " + x); // x : 10
        System.out.println("x : " + x * 10); // x : 100 곱셈 먼저
        System.out.println("x : " + x + 10); // x :  1010
        System.out.println("x : " + (x + 10)); // x : 20 소괄호 먼저
    }
}