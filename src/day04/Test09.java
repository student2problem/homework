package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 extends Emp{
    public static void main(String[] args) throws ParseException {
        List<Emp> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工信息");
        String str = console.next();
        String[] str1 = str.split(";");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for(String person : str1){
            String[] str2 = person.split(",");
            String name = str2[0];
            int age = Integer.parseInt(str2[1]);
            String gender = str2[2];
            int salary = Integer.parseInt(str2[3]);
            Date hiredate = sf.parse(str2[4]);
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            list.add(emp);
        }
        for(Emp emp : list){
            System.out.println(emp);
        }
        for(Emp emp : list){
            Calendar cal = Calendar.getInstance();
            cal.setTime(emp.getHiredate());
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            System.out.println(emp.getName()+"转正日期为: "+ sf.format(cal.getTime()));
        }
    }
}
