package seed.step07_string;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (int i = 0; i < word.length(); i++) {
            char changeWord = word.charAt(i);
            if (Character.isLowerCase(changeWord)){
                changeWord = Character.toUpperCase(changeWord);
            } else if (Character.isUpperCase(changeWord)) {
                changeWord = Character.toLowerCase(changeWord);
            }
            System.out.print(changeWord);
        }
    }
}
