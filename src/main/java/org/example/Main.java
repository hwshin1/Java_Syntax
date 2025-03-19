package org.example;

// 문제 : 1개의 자동차가 3번 달리게 해주세요.
public class Main {
    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        a자동차1.최고속력 = 180;

        a자동차1.달리다();
        a자동차1.달리다();
        a자동차1.달리다();

        // 자동차 a자동차2 = new 자동차();
        // a자동차2.최고속력 = 210;
        // System.out.println("a자동차2 최고속력: " + a자동차2.최고속력);
    }
}

class 자동차 {
    int 최고속력;

    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}