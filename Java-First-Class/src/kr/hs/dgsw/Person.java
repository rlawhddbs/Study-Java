package kr.hs.dgsw;

public class Person {

    String name = "홍길동";

    int age = 0;

    double height = 0.0;

    void aged() {
        age++;
        height += 6.2;
    }

    void print() {
        System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.", name, age, height);
    }

    public static void main(String[] args) {
        Person hongGilDong = new Person();

        for (int i = 0; i < 15; i++) {
            hongGilDong.aged();
        }

        hongGilDong.print();

    }

}