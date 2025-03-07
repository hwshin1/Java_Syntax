package org.example;

public class Main {
    public static void main(String[] args) {
        //후위연산
        int a = 1;
        int i = a++; // a가 i에 대입을 먼저 한후 a에 1을 더한다

        System.out.println(a); // 2
        System.out.println(i); // 2가 아니라 1이 나옴

        //전위연산
        int b = 1;
        int j = ++b; // b에 1을 먼저 더한후 j에 대입을 한다

        System.out.println(b); // 2
        System.out.println(j); // 2 가 나옴
    }
}