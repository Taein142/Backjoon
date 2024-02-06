package step.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int[] arr = new int[subject];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < subject; i++) {
            int score = Integer.parseInt(st.nextToken());
            arr[i] = score;

            if (score > max) {
                max = score;
            }
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            double newScore = (double) arr[i] / max * 100;
            sum += newScore;
        }

        System.out.println(sum / arr.length);
    }
}