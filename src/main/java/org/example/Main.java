package org.example;

// 레퍼런스 변수에 값 할당 과정 설명
public class Main {
    public static void main(String[] args) {
        // 오직 Car 이라는 리모콘이 담긴 것만 저장 할 수 있는 변수 acar을 만든다.
        // acar에는 자동차 클래스로 만든 리모콘이 들어가게 된다.
        Car acar;

        // Car 설계도(클래스)로 Car 객체를 변수 외부에 만든다.
        // Car 객체는 자신을 조종할 수 있는 리모콘(this)를 가지고 태어난다.
        // 변수 acar에 Car 객체를 조종 할 수 있는 리모콘을 복사해서 반환한다.
        acar = new Car();

        // 변수 acar 안에 있는 Car 설계도를 가진 리모콘에 run 버튼을 누른다.
        // 해당 신호가 리모콘과 연결되어 있는 Car 객체에 전달돼 run 메소드를 실행한다.
        acar.run();
    }
}

// Car 설계도
class Car {
    // run 메소드 기능
    // run 기능 생성
    // 리모콘 버튼
    void run() {
        // run 기능 '자동차가 달립니다.' 를 출력해준다.
        System.out.println("자동차가 달립니다.");
    }
}
