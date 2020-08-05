package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        Test11 t = new Test11();
        File dir = new File(".");
        List<Emp> list = t.loadEmp(dir);
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for(Emp e : list){
            System.out.println(e);
        }

    }

    public List<Emp> loadEmp(File dir) throws IOException, ParseException {
        List<Emp> list = new ArrayList<>();
        File[] emps = dir.listFiles(pathname-> {
                return pathname.getName().endsWith(".emp");
        });
        for(File file :emps){
            list.add(parseEmp(file));
        }
        return list;
    }

    public Emp parseEmp(File file) throws ParseException, IOException {
        RandomAccessFile raf = new RandomAccessFile(file,"r");
        //文件多大就创建多大的数组
        byte[] buf = new byte[(int)file.length()];
        //将文件数据全部读取出来并转换为字符串
        int len=raf.read(buf);
        String info = new String(buf,0,len);
        //解析字符串并转换为Emp对象
        String[] infos = info.split(",");
        String name = infos[0];
        int age = Integer.parseInt(infos[1]);
        String gender = infos[2];
        int salary = Integer.parseInt(infos[3]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date hiredate = sdf.parse(infos[4]);
        Emp emp = new Emp(name,age,gender,salary,hiredate);
        //打桩
        System.out.println("读取emp:"+emp);
        return emp;
    }
}
