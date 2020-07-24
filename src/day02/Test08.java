package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 extends Person{
    public Test08(String name, int age, String gender, int salary) {
        super(name, age, gender, salary);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工信息: ");
        String str = console.next();
        //拆分每个员工
        String[] str1 = str.split(";");
        Person[] person = new Person[str1.length];
        for(int i=0;i<person.length;i++){
            String str2 = str1[i];
            String[] data = str2.split(",");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String gender = data[2];
            int salary = Integer.parseInt(data[3]);
            Person p = new Person(name,age,gender,salary);
            person[i] = p;
        }
        for(int i=0;i<person.length;i++){
            System.out.println(person[i]);
        }
    }
}
