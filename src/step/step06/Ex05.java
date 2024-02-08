package step.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String input = br.readLine();
        int max = -1;
        char ch = '?';

        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                arr[input.charAt(i) - 'A']++;
            } else {
                arr[input.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max){
                max = arr[i];
                ch = (char) (i+65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
