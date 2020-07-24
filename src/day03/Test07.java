package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 extends Emp{
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工数量");
        int num = console.nextInt();

        Collection col = new ArrayList();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        for(int i=1;i<=num;i++){
            System.out.println("请输入第"+i+"个员工的信息");
            String str = console.next();
            String[] person = str.split(",");
            String name = person[0];
            int age = Integer.parseInt(person[1]);
            String gender = person[2];
            int salary = Integer.parseInt(person[3]);
            Date hiredate = sf.parse(person[4]);
            Emp emp = new Emp(name,age,gender,salary,hiredate);
            if(col.contains(emp)){
                System.out.println("该员工已存在");
                continue;
            }
            col.add(emp);
        }
        System.out.println(col);
    }
}
