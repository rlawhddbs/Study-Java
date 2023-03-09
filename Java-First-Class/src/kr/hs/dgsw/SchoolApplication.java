package kr.hs.dgsw;

public class SchoolApplication {

    public static void main(String[] args) {

        School school = new School();

        school.enroll();
        school.enroll();
        school.enroll();
        school.graduate();

        school.countOfStudents = 5;

        school.printInformation();

    }

}
