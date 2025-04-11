package org.example;

public class Main {
    public static void main(String[] args) {
        계좌 b = new 계좌();
        b.bankNumber(1);
        b.bankNumber(2);
        b.bankNumber(3);

        입출금 m = new 입출금();
        m.addMoney(2000);
        m.outMoney(500);

        에어컨 ac = new 에어컨();
        ac.번호(3001);

        핸드폰 hp = new 핸드폰();
        hp.가격(60000, 50000);

        자동차 ca = new 자동차();
        ca.최고속도(280);
    }
}

class 계좌 {
    void bankNumber(int i) {
        System.out.println("계좌번호 : " + i);
    }
}

class 입출금 {
    void addMoney(int m) {
        System.out.println("입금 : " +  m + "원");
    }

    void outMoney(int m) {
        System.out.println("출금 : " + m + "원");
    }
}

class 에어컨 {
    void 번호(int i) {
        System.out.println("제품 번호 : " + i);
    }
}

class 핸드폰 {
    void 가격(int m, int n) {
        int result = m + n;
        System.out.println("가격 : " + result + "원");
    }
}

class 자동차 {
    void 최고속도(int max) {
        System.out.println("최고 속력 : " + max + "km/h");
    }
}
