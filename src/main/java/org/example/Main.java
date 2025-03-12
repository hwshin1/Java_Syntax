package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        /*
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        ... int[] 배열의 갯수가 길어질수록 값을 넣는게 많아진다
        */

        // 반복문을 사용해서 arr[]에 값을 넣기
        for (int i = 0; i < arr.length; i++) { // i = 0 부터 시작하는 이유 배열은 arr[0]부터 시작함
            arr[i] = i + 1; // 값이 1부터 들어간다
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}