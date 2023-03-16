package kr.hs.dgsw.string;

public class StringLength {

    public void study() {
        String str1 = "Hello World";
        String str2 = "홍길동";
        showLength(str1);
    }

    void showLength(String str) {
        int length = str.length();
        System.out.printf("\"%s\"의 길이는 %d입니다. \n", str, length);
    }

    public static void main(String[] args) {
        StringLength stringLength = new StringLength();
        stringLength.study();
    }

}
