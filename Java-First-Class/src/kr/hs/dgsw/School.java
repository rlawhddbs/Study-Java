package kr.hs.dgsw;

public class School {

    String schoolName = "대구소프트웨어마이스터고등학교";

    int countOfStudents = 0;

    void teach() {
        System.out.println("학생들을 가르칩니다");
        System.out.printf("%d %f %s", 3, 3.14, "원주율");
    }

    void enroll() {
        countOfStudents = countOfStudents + 1;
    }

    void graduate() {
        if(countOfStudents > 0) {
            countOfStudents = countOfStudents - 1;
        }
    }

    void printInformation() {
        System.out.printf("%s에는 %d명이 재학중입니다.", schoolName, countOfStudents);
    }

}