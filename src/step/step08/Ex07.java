package step.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());
//
//        int cnt = 0;
//
//        for (int i = 0; i < v; i+=a) {
//            if (i > 1){
//                i -= b;
//            }
//            cnt++;
//        }
//        System.out.println(cnt);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int cnt = (v - b - 1) / (a - b) + 1;

        System.out.println(cnt);


    }
}