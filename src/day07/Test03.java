package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException, IOException {
        Test03 t = new Test03();
        int sum = t.getInputSum();
        System.out.println("你要输入"+sum+"个员工信息");
        for (int i = 1; i < sum; i++) {
            System.out.println("请输入第"+i+"个员工信息");
            Emp emp = t.getEmp();
            t.saveEmp(emp);
        }
        System.out.println("操作完成");
    }

    //记录输入的员工人数
    public int getInputSum(){
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("请输入员工人数: ");
            sum = Integer.valueOf(console.nextLine());
            if(sum>=5){
                return sum;
            }
        }
    }
    //记录员工信息
    public Emp getEmp() throws ParseException {
        Scanner console = new Scanner(System.in);
        String  data = console.nextLine();
        String[] str = data.split(",");
        String name = str[0];
        int age = Integer.valueOf(str[1]);
        String gender = str[2];
        int salary = Integer.valueOf(str[3]);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date hiredate = sf.parse(str[4]);
        Emp emp = new Emp(name,age,gender,salary,hiredate);
        return  emp;
    }

    public void saveEmp(Emp emp) throws IOException {
        FileOutputStream fos = new FileOutputStream(emp.getName()+"obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);

        oos.close();
    }
}
