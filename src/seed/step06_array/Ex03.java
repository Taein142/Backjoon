package seed.step06_array;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int doneProject = scanner.nextInt();
            // 프로젝트를 완료한 학생에게 1 부여
            students[doneProject - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
