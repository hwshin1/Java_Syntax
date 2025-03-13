package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[7];

        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10; // 10, 20, 30씩 값을 넣는다.
        }
        // arr[0] 부터 값을 넣는다

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 배열의 합을 구한다.

        int average = sum / arr.length;
        // 배열의 합과 배열의 길이를 나누면 평균이 된다.

        System.out.printf("총합 : %d\n", sum);
        System.out.printf("평균 : %d\n", average);
    }
}