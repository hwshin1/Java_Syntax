package org.example;

public class Main {
    public static void main(String[] args) {
        // `a칼` 에는 오직 칼 리모콘만 들어간다.
        칼 a칼 = new 칼();

        a칼 = new 활();
        // 에러가 뜬다.
        // 이유는 활 객체는 칼 객체에 상속 받고 있다.
        // 근데 상속을 해주는 칼에 쏘기() 메서드가 없어 인식을 못한다.
        a칼.쏘기();
    }
}

class 칼 {
    // 활이 칼을 상속 받을 수 있게 칼 객체에 적어준다.
    void 쏘기() {
        System.out.println("활을 쏩니다.");
    }
}

class 활 extends 칼 {
}
