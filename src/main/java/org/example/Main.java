package org.example;

// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.
// * 100까지 출력
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
        System.out.println(dan + " * " + i + " = " + dan * i); // 이걸 100개를 추가를 하면 어디까지 출력이 되었는지 확인이 안되고 코드가 길어짐

        System.out.println("===========================");
        // while 문
        int j = 1;

        while (j <= 100) {
            System.out.println(dan + " * " + j + " = " + dan * j);
            j++;
        } // 반복문을 쓰면 코드를 줄일수 있다.
    }
}