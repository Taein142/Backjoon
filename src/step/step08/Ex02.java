package step.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Character> nList = new ArrayList<>();

        while (n > 0) {
            if (n % b < 10) {
                nList.add((char) (n % b + '0'));
            } else if (n >= 10) {
                nList.add((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }
        for (int i = nList.size() - 1; i >= 0; i--) {
            System.out.print(nList.get(i));
        }

        br.close();
    }
}
