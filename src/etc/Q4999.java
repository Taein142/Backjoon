package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jae_ah = br.readLine();
        String doc_ah = br.readLine();

        if (jae_ah.length() >= doc_ah.length()){
            System.out.println("go");
        }else {
            System.out.println("no");
        }
    }
}
