package org.example;

public class Main {
    public static void main(String[] args) {
        int age = 8;
        System.out.println("당신의 나이 : " + age);

        System.out.println("방법 1");
        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.");
        }
        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("방법 2");

        if (age <= 19) {
            System.out.println("할인 대상입니다.");
        }
        if (age >= 60) {
            System.out.println("할인 대상입니다.");
        }
        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("방법 3");

        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.");
        } else if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("방법 4");

        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("방법 5");

        if (age <= 19) {
            System.out.println("할인 대상입니다.");
        } else if (age >= 60) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("방법 6");

        if (age > 19 && age < 60) {
            System.out.println("할인 대상이 아닙니다.");
        } else {
            System.out.println("할인 대상입니다.");
        }

        System.out.println("방법 7");

        if (age <= 19 || age >= 60) {
            System.out.println("할인 대상입니다.");
        } else if (age > 19) {
            if (age < 60) {
                System.out.println("할인 대상이 아닙니다.");
            }
        }
    }
}