package class01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer blank = new StringTokenizer(sentence," ");
        System.out.println(blank.countTokens());
    }
}
