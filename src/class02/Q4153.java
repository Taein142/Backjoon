package class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 & c == 0){
                break;
            }

            int max;
            max = Math.max(a, b);
            max = Math.max(max, c);
            boolean result = false;
            if (max == a) {
                if (max * max == (b * b) + (c * c)) {
                    result = true;
                }
            } else if (max == b) {
                if (max * max == (a * a) + (c * c)) {
                    result = true;
                }
            } else {
                if (max * max == (a * a) + (b * b)) {
                    result = true;
                }
            }
            if (result) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
