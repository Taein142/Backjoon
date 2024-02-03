package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int result = 0;

        List<Integer> remainderList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a = Integer.parseInt(br.readLine());
            result = a % 42;
            if (!remainderList.contains(result)){
                remainderList.add(result);
            }
        }
        System.out.println(remainderList.size());
    }
}
