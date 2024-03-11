package class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int input = Integer.parseInt(br.readLine());

            if (input==0) {
                break;
            }

            boolean check = false;
            String inputStr = Integer.toString(input);

            for (int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);
                char revCh = inputStr.charAt(inputStr.length()-i-1);

                if (ch == revCh){
                    check = true;
                }else {
                    check = false;
                    break;
                }
            }

            if (check){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
