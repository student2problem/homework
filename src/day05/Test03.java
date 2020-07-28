package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        List<Emp> list = getEmp();
        Collections.sort(list);
        for(Emp e : list){
            System.out.println(e);
        }

        System.out.println("按照入职时间从晚到早排序: ");
        Comparator<Emp> com = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                long time = o1.getHiredate().getTime() - o2.getHiredate().getTime();
                return time<0?1:-1;
            }
        };
        Collections.sort(list,com);
        for(Emp e : list){
            System.out.println(e);
        }
    }

    public static List<Emp> getEmp() throws ParseException {
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工信息: ");
        String str = console.next();
        String[] arr = str.split(";");
        for(String data : arr){
            String[] arr1 = data.split(",");
            String name = arr1[0];
            int age = Integer.parseInt(arr1[1]);
            String gender = arr1[2];
            int salary = Integer.parseInt(arr1[3]);
            Date hiredate = sf.parse(arr1[4]);
            Emp e = new Emp(name,age,gender,salary,hiredate);
            list.add(e);
        }
        return list;
    }
}
