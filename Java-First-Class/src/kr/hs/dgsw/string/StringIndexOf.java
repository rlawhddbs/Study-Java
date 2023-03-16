package kr.hs.dgsw.string;

public class StringIndexOf {

    void study() {
        String str1 = "죽는 날까지 하늘을 우러러 한 점 부끄럼 없기를";
        String str2 = "Hello world!";

        showPosition(str1, "죽는");
        showPosition(str1, "하늘");
        showPosition(str2, "world");
        showPosition(str2, "abcd");
        showPosition(str2, "l");

        showPosition(str2, "l", 2);
        showPosition(str2, "l", 3);
        showPosition(str2, "l", 4);
    }

    void showPosition(String str, String pattern) {
        int position = str.indexOf(pattern);
        System.out.printf("\"%s\" 문장에서 \"%s\" 은 %d번째 나옵니다\n", str, pattern, position);
    }

    void showPosition(String str, String pattern, int fromIndex) {
        int position = str.indexOf(pattern, fromIndex);
        System.out.printf("\"%s\" 문자에서 \"%s\" 은 %d번째 나옵니다.\n", str, pattern, position);
    }

    public static void main(String[] args) {
        StringIndexOf stringIndexOf = new StringIndexOf();
        stringIndexOf.study();
    }

}
