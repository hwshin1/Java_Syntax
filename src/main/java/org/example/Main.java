package org.example;

public class Main {
    public static void main(String[] args) {
        //피보나치 수열
        int n = 10, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}