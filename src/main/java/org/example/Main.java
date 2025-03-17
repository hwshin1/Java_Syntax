package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 객체 없는 Ver ==");
        // 사람1 => 학생
        int person1_num = 1; // 사람1의 번호
        int person1_age = 22; // 사람1의 나이
        int person1_height = 160; // 사람 1의 키

        // 사람2 => 학생
        int person2_num = 2; // 사람2의 번호
        int person2_age = 20; // 사람2의 나이
        int person2_height = 175; // 사람2의 키

        // 객체 없는 버전 특징
        // 변수를 이름이 있는 변수로 변경하면 어떤 내용인지는 알 수 있다.

        System.out.println("== 객체 사용 Ver ==");
        int[] person1 = new int[3];
        person1[0] = 1; // 사람1 번호
        person1[1] = 22; // 사람1 나이
        person1[2] = 160; // 사람1 키

        int[] person2 = new int[3];
        person2[0] = 2; // 사람 2의 번호, 인스턴스 변수
        person2[1] = 30; // 사람 2의 나이, 인스턴스 변수
        person2[2] = 180; // 사람 2의 키, 인스턴스 변수

        // 이건 주석을 달아야지만 어떤 코드인지 알 수 있다.
    }
}