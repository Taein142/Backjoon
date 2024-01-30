package seed.step08_function;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(), b=sc.nextLong();
    System.out.println((a+b)*(a-b));
    }
}
