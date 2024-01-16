package seed.step03_condition;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long sub = N-M;
        if (sub < 0){
            sub = -sub;
        }
        System.out.println(sub);
    }
}
