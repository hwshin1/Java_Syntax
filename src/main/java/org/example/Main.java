package org.example;

// 문제 : 1부터 5까지의 합을 출력해주세요.
public class Main {
    public static void main(String[] args) {
        int sum = 0; // 빈 상자 만들기 다른 값이 들어가면 그 값을 더해버려서 답이 바뀜
        int i = 1;

        while (i <= 5) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}