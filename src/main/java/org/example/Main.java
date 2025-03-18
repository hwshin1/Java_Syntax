package org.example;

// 문제 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
public class Main {
    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        a자동차1.최고속력 = 180;
        System.out.println("a자동차1 최고속력: " + a자동차1.최고속력);

        자동차 a자동차2 = new 자동차();
        a자동차2.최고속력 = 210;
        System.out.println("a자동차2 최고속력: " + a자동차2.최고속력);
    }
}

class 자동차 {
    int 최고속력;
}