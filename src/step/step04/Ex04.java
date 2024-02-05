package step.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int maxNum = 0;
        int count = 0;

        for (int i = 1; i <= 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (num>maxNum){
                maxNum = num;
                count = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(count);
    }
}
