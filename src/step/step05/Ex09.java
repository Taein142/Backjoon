package step.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        String b = st.nextToken();
        StringBuilder num1 = null;
        StringBuilder num2 = null;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(a.length() - (i + 1));
            if (num1 == null) {
                num1 = new StringBuilder(String.valueOf(ch));
            } else {
                num1.append(ch);
            }
        }
        assert num1 != null;
        int intValue1 = Integer.parseInt(num1.toString());

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(b.length() - (i + 1));
            if (num2 == null) {
                num2 = new StringBuilder(String.valueOf(ch));
            } else {
                num2.append(ch);
            }
        }
        assert num2 != null;
        int intValue2 = Integer.parseInt(num2.toString());

        br.close();

        if (intValue1 > intValue2) {
            System.out.println(intValue1);
        } else if (intValue2 > intValue1) {
            System.out.println(intValue2);
        }
    }
}
