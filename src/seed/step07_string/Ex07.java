package seed.step07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            System.out.println(firstChar + "" + lastChar);
        }
        br.close();
    }
}
