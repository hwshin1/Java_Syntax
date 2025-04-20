package org.example;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.공격("브라이언", "칼");
        a전사.재공격();
        a전사.공격("필립", "방패");
        a전사.공격("마크", "지팡이");
        a전사.재공격();
        a전사.재공격();
    }
}

class 전사 {
    String lastName;
    String waponName;
    void 공격(String name, String wapon) {
        System.out.println(name + "(이)가 " + wapon + "(으)로 공격합니다.");

        lastName = name;
        waponName = wapon;
    }

    void 재공격() {
        System.out.println(lastName + "(이)가 " + waponName + "(으)로 재공격 합니다.");
    }
}
