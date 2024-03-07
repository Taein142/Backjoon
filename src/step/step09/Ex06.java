package step.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
