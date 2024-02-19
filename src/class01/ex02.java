package class01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26]; // 크기가 26인 배열 선언
        String word = sc.next();
        int max = -1;
        char ch = '?';


        for (int i = 0; i < word.length(); i++){ // 대소문자 상관없이 입력받은 단어의 알파벳을 배열에 추가

            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') { // 대문자 범위
                arr[word.charAt(i) - 'A']++;
            }

            else {	// 소문자 범위
                arr[word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) { // 가장 많이 쓰인 알파벳을 찾는 것.
            if (arr[i] > max) { // 가장 많이 쓰인 알파벳을 대문자로 출력
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) { // 가장 빈도가 높은 알파벳이 2개 이상이라면 ? 출력
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}