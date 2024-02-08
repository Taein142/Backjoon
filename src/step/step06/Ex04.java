package step.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        br.close();

        for (int i = 1; i <= input.length(); i++) {
            char ch = input.charAt(input.length() - i);
            sb.append(ch);
        }

        String inputReverse = sb.toString();

        if (input.equals(inputReverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
