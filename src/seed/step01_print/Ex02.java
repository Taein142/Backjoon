package seed.step01_print;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    // 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        String date = null;
        date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date);
    }
}

