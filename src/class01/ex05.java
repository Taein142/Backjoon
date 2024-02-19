package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10]; // 크기가 10인 배열 선언.

        // 숫자 3개를 입력받고 그 수들을 곱함
        int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(mul); // mul을 문자열로 변환

        for (int i = 0; i < str.length(); i++) {
            // 해당문자열을 반복하면서 ASCII 코드에서 대응하는 값을 얻고 이를 배열의 인덱스로 사용하여 해당 숫자의 등장횟수를 증가시킴
            arr[(str.charAt(i) - 48)]++;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
