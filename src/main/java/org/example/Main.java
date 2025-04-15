package org.example;

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다(); // 상속받은 숨쉬다 메서드 실행 가능
    }
}

class 사람 extends 동물 {
    // 동물 클래스에서 상속 받기
}

class 동물 {
    void 숨쉬다() {
        System.out.println("숨을 쉼");
    }
}
