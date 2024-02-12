package step.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = -1;
        int rowIdx = 0;
        int colIdx = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowIdx = i + 1;
                    colIdx = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(rowIdx + " " + colIdx);
    }
}
