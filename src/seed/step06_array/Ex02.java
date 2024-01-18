package seed.step06_array;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 정수의 개수
        int[] arr = new int[N]; // 정수배열

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int v = scanner.nextInt(); // 찾으려고 하는 정수
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}