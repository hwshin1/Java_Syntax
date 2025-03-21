package org.example;

// 문제 : 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
public class Main {
    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();
        자동차 a자동차3 = new 자동차();

        a자동차1.번호 = "자동차1";
        a자동차1.최고속력 = 180;
        a자동차2.번호 = "자동차2";
        a자동차2.최고속력 = 280;
        a자동차3.번호 = "자동차3";
        a자동차3.최고속력 = 300;

        a자동차1.달리다();
        a자동차2.달리다();
        a자동차3.달리다();
    }
}

class 자동차 {
    String 번호;
    int 최고속력;

    void 달리다() {
        System.out.println(번호 + "이 " + this.최고속력 + "km/h로 달립니다.");
    }
}