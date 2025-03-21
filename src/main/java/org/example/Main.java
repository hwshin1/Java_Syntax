package org.example;

// 문제 : 3개의 자동차가 각각 1번씩 달리게 해주세요.
public class Main {
    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        a자동차1.달리다();

         자동차 a자동차2 = new 자동차();
         a자동차2.달리다();

        자동차 a자동차3 = new 자동차();
        a자동차3.달리다();
    }
}

class 자동차 {
    int 최고속력;

    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}