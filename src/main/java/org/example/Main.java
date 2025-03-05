package org.example;

public class Main {
    public static void main(String[] args) {
        // 조건문
        int age = 18;
        System.out.println("당신의 나이 : " + age);

        if (age >= 20) {
            System.out.println("성인");
        }
        if (age < 20) {
            System.out.println("미성년자");
        }
    }
}