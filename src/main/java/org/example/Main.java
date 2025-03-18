package org.example;

public class Main {
    public static void main(String[] args) {
        GameCharater person1 = new GameCharater();
        person1.num = 1;
        person1.age = 22;
        person1.height = 160;

        GameCharater person2 = new GameCharater();
        person2.num = 2;
        person2.age = 30;
        person2.height = 180;

        // 훨씬 데이터를 다루기가 쉽다.
    }
}

// class로 직접 객체를 만들기
class GameCharater {
    int num;
    int age;
    int height;
}