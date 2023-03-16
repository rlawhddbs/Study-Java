package kr.hs.dgsw.string;

public class StringReplace {

    void study() {
        String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
        stringReplace(str);
    }

    void stringReplace(String str) {
        String str1 = "남산 위에 저 소나무 철갑을 두른듯 바람서리 불변함은 우리 기상일세";
        String str2 = str.replace("동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세", str1);

        System.out.printf("바꾸기 전 문자열 : \"%s\"\n바꾼 후 문자열 : \"%s\"", str, str2);
    }

    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        stringReplace.study();
    }
}
