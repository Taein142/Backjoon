package class01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) { // 별입력하기(반대편부터)
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 별을 입력할 줄 수
        for (int i = 1; i<=N; i++){
            for (int j = 1; j<=N-i; j++){
                System.out.print(" "); // 공백을 먼저 입력받음
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*"); // 공백 뒤에 별을 입력받음
            }
            System.out.println(""); // 줄바꿈
        }
    }
}