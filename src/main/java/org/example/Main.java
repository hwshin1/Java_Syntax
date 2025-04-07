package org.example;

public class Main {
    public static void main(String[] args) {
        계산기.합(5, 3);
        계산기.차(7, 4);
        계산기.곱(2, 3);
    }
}

class 계산기 {
    static void 합(int a, int b) {
        System.out.println(a + b);
    }

    public static void 차(int a, int b) {
        System.out.println(a - b);
    }

    public static void 곱(int a, int b) {
        System.out.println(a * b);
    }
}
