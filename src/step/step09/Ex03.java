package step.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean run = true;

        while (run) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                run = false;
            } else {
                List<Integer> divisorList = new ArrayList<>();
                int sum = -n;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        divisorList.add(i);
                        sum += i;
                    }
                }
                StringBuilder sb = new StringBuilder();
                if (sum == n) {
                    sb.append(n).append(" = ");
                    for (int i = 0; i < divisorList.size()-1; i++) {
                        sb.append(divisorList.get(i));
                        if (i != divisorList.size() - 2) {
                            sb.append(" + ");
                        }
                    }
                } else {
                    sb.append(n).append(" is NOT perfect.");
                }
                String result = sb.toString();
                System.out.println(result);
            }
        }
    }
}
