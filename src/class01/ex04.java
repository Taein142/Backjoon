package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int maxNum = 0;
        int count = 0;

        for (int i = 1; i <= 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (num>maxNum){ // 입력받은 값들 중 최댓값 구하기
                maxNum = num;  // 최댓값 수정
                count = i; // 최댓값의 순번을 저장
            }
        }
        System.out.println(maxNum);
        System.out.println(count);
    }
}
