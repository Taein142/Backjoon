package class01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String word = sc.next();
        int max = -1;
        char ch = '?';


        for (int i = 0; i < word.length(); i++){

            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                arr[word.charAt(i) - 'A']++;
            }

            else {	// 소문자 범위
                arr[word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}