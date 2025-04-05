package org.example;

public class Main {
    public static void main(String[] args) {
//        GameCharacter gameCharacter = new GameCharacter(); // static으로 바로 GameCharacter로 사용 가능

        int 게임번호 = GameCharacter.no = 1001;
        int 나이 = GameCharacter.age = 20;
        String 직업 = GameCharacter.job = "전사";

        System.out.println("Game Number : " + 게임번호);
        System.out.println("age : " + 나이);
        System.out.println("Game Job : " + 직업);
    }
}

class GameCharacter {
    // 스태틱 변수로 만들면 객체를 가지지 않고 Main 메서드에서 사용이 가능
    static int no;
    static int age;
    static String job;
}
