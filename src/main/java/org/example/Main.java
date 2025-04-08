package org.example;

public class Main {
    static int a = 20;

    public static void main(String[] args) {
        System.out.println(a);

        int a = 30;
        System.out.println(a);

        int result = 계산기.합(10, 20);

        exam(result);
    }

    private static void exam(int a) {
        System.out.println("a : " + a);
    }
}

class 계산기 {
    public static int 합(int a, int b) {
        System.out.println(a + b);

        return a + b;
    }
}
