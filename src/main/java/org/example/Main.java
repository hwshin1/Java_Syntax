package org.example;

public class Main {
    public static void main(String[] args) {
        // 정수 100개 컨트롤
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

        System.out.println("============");
        // 정수 100개의 합.
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // sum에 배열의 값들을 다 더한것을 넣는다.
        }

        System.out.println(sum);
    }
}