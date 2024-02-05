package step.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n];

        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int j = start-1; j < end; j++) {
                baskets[j] = ball;
            }
        }

        br.close();

        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}