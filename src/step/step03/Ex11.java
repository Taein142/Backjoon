package step.step03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A == 0 && B == 0) {
                run = false;
            } else {
                System.out.println(A + B);
            }
        }
    }
}
