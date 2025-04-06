package org.example;

// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
public class Main {
    public static void main(String[] args) {
        자동차.달리다();
    }
}

class 자동차 {
    // static 변수로 만들면 객체를 가지지 않고 Main 메서드에서 사용이 가능
    static void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}
