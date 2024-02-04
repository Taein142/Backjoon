package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String inputString = null;

        for (int i = 0; i < num; i++) {
            int score = 0;
            int sum = 0;
            inputString = br.readLine();
            for (int j = 0; j < inputString.length(); j++) {
                char currentChar = inputString.charAt(j);
                if (currentChar == 'O') {
                    score++;
                    sum += score;
                } else if (currentChar == 'X') {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}