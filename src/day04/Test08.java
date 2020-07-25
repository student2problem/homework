package day04;

import java.net.SocketImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        List<Date> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        for(int i=1;i<=3;i++){
            System.out.println("请输入第"+i+"个日期");
            String days = console.nextLine();
            Date date = sf.parse(days);
            list.add(date);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
