package org.example;

// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
public class Main {
    public static void main(String[] args) {
        int dan = 5;

        int i = 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1; // i를 1씩 증가한다
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        // 코드는 위에서 아래로 읽기 때문에 출력문 다음에 i를 1씩 증가하는 문장을 넣으면 i는 1,2,3,4,5 이런식으로 변화한다.
    }
}