package org.example;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter1 = new GameCharacter();

        int 게임번호 = gameCharacter1.no = 1001;
        int 나이 = gameCharacter1.age = 20;
        String 직업 = gameCharacter1.job = "전사";

        System.out.println("Game Number : " + 게임번호);
        System.out.println("age : " + 나이);
        System.out.println("Game Job : " + 직업);
    }
}

class GameCharacter {
    int no;
    int age;
    String job;
}
