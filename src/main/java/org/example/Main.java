package org.example;

public class Main {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
    }
}

class 무기 {
    void 공격() {
        System.out.println("공격하기 위해 무기를 들었다.");
    }
}

class 칼 extends 무기 {
}
