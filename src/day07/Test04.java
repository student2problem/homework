package day07;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test04 t = new Test04();
        File dir = new File(".");
        List<Emp> list =t.loadEmps(dir);
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        for(Emp emp:list){
            System.out.println(emp);
        }
    }
    public List<Emp> loadEmps(File dir) throws IOException, ClassNotFoundException {
        List<Emp> list = new ArrayList<>();
        //获取.obj文件
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".obj");
            }
        });
        for(File file : files){
            Emp emp = loadEmp(file);
            list.add(emp);
        }
        return list;
    }

    public Emp loadEmp(File file) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Emp e = (Emp)ois.readObject();
        ois.close();
        return e;
    }
}
