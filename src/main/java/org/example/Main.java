package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 20 + Math.더하기(10, 20);
        System.out.println(a);

        int 결과1 = Math.oneToSum(3);
        System.out.println(결과1);

        int 결과2 = Math.oneToSum(10);
        System.out.println(결과2);
    }
}

class Math {
    public static int 더하기(int a, int b) {
        int c = a + b;

        return c;
    }

    // 1부터 n까지의 합을 반환하는 함수
    static int oneToSum(int b) {
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
