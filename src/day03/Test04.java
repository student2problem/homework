package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入生产日期: ");
        String  pd = console.next();
        System.out.println("请输入保质期天数: ");
        int  ed = console.nextInt();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sf1.parse(pd);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.DATE,ed);
        cal.add(Calendar.WEEK_OF_MONTH,-2);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        date1 = cal.getTime();
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println("促销日期为: "+sf1.format(date1));
    }
	
}
