package org.example;

public class Main {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();

        청둥오리 b오리 = new 청둥오리();
        b오리.날다();

        흰오리 c오리 = new 흰오리();
        c오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {

}

class 흰오리 extends 오리 {

}

class 고무오리 extends 오리 {
    @Override
    void 날다() {
        System.out.println("저는 날 수 없어요.");
    }
}
