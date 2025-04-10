package org.example;

public class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    // static을 써서 객체 생성을 안하고 바로 가져 올수 있다.
    static int nToMSum(int n, int m) { // 매개변수를 넣어 값 가져오기
        int sum = n + m;

        return sum; // 리턴으로 반환
    }
}
