package day03;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String id = "";
        String regex = "\\d{17}(\\d|[xX])";
        while (true){
            System.out.println("请输入身份证号: ");
            id = console.next();
            if(!id.matches(regex)){
                System.out.println("请输入正确的身份证号");
            }else {
                break;
            }
        }
        String birth = id.substring(6,14);
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Date birthday = sf.parse(birth);
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("出生日期: "+sf1.format(cal.getTime()));
        cal.add(Calendar.YEAR,20);
        System.out.println("20岁生日: "+sf1.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println("当周的周三为: "+sf1.format(cal.getTime()));
    }
}
