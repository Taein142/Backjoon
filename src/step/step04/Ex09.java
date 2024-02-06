package step.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            while (start < end) {
                int temp = basket[start];
                basket[start] = basket[end];
                basket[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}