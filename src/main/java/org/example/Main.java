package org.example;

public class Main {
    public static void main(String[] args) {
        // 증감연산
        int i = 1;
        System.out.println(i);

        i = i + 1; // i의 값을 1 증가시킨다
        System.out.println(i);

        i += 1; // i의 값을 1 증가시킨다
        System.out.println(i);

        i++; // i의 값을 1 증가시킨다 <= 3개중에서 가장 많이 쓰는 증감연산
        System.out.println(i);
    }
}