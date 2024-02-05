package step.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (max < number) {
                max = number;
            } if (min > number) {
                min = number;
            }
        }
        System.out.println(min + " " + max);
    }
}
