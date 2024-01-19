package seed.step06_array;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(A[i-1]+B[i-1]);
        }
    }
}
