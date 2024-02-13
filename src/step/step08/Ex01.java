package step.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int sum = 0;

        for(int i = n.length()-1 ; i >= 0; i--){
            char C = n.charAt(i);

            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= b;
        }

        System.out.println(sum);
    }
}
