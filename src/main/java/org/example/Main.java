package org.example;

public class Main {
    public static void main(String[] args) {
        double a = 2.1;
        if ((a + a + a ) == 6.3) {
            System.out.println("같음");
        } else {
            System.out.println("다름"); // 이게 실행된다.
        }
        // float와 double 타입 부동소수점 연산
        // 다름이 나오는 이유 실수를 계산 할 때에는 정확도가 부정확 할 수 있다
        /* 부동소수점 연산
        넓은 범위의 수를 빠르게 정밀한 '근사치'로 계산하도록 되어있다.
        따라서 정확한 결과가 필요할 때는 사용하면 안된다.
        */
    }
}