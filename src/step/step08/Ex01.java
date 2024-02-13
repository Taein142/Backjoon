package step.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken(); // 숫자 (근데 문자일수도)
        int b = Integer.parseInt(st.nextToken()); //진법

        int tmp = 1; // 각 자리의 가중치를 표현하기 위한 변수
        int sum = 0; // 최종 결과를 저장할 변수

        // 입력받은 숫자를 진법에 따라 10진수로 변환하는 반복문
        for(int i = n.length()-1 ; i >= 0; i--){
            char ch = n.charAt(i); //입력값 끝자리부터 판별

            // 알파벳인 경우, 해당 알파벳에 대응하는 숫자로 변환하여 계산
            if ('A' <= ch && ch<= 'Z') {
                sum += (ch - 'A' + 10) * tmp;
            } else {
                // 숫자인 경우, 그대로 정수로 변환하여 계산
                sum += (ch - '0') * tmp;
            }
            tmp *= b;  // 다음 자리의 가중치를 계산하기 위해 진법만큼 곱셈
        }

        System.out.println(sum);

        br.close();
    }
}
