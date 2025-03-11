package org.example;

public class Main {
    public static void main(String[] args) {
        // 배열
        int a = 10;
        int[] arr; // 정수형 모양으로 만들어진 객체의 리모컨만 들어갈수 있는 arr 변수를 만든다
        arr = new int[3]; //new 새로운 객체를 만든다

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[1]); // 20 출력
    }
}