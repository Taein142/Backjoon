package seed.step06_array;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];

        if (N >= 1 && X <= 10000) {
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.println(A[i] + "");
            }
        }
    }
}
