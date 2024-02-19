package class01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer blank = new StringTokenizer(sentence," "); // 입력받은 문장을 띄어쓰기로 구분함
        System.out.println(blank.countTokens()); // 띄어쓰기로 구분하였을 때 단어의 개수를 출력
    }
}
