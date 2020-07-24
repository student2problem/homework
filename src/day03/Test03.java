package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日: ");
        Scanner console = new Scanner(System.in);
        String birth = console.next();

        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sf1.parse(birth);

        Date date = new Date();
        long time = date.getTime()-date1.getTime();
        long week = time/(1000*60*60*24*7);
        System.out.println(week);
    }

}
