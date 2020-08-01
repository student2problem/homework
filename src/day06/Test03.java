package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner  console = new Scanner(System.in);
        System.out.println("请输入一个目录名");
        String dirName = console.next();
        File dir = new File(dirName);
        if(!dir.exists()){
            dir.mkdir();
        }else {
            int index = 1;
            while (true){
                String name = dirName+"_副本"+index;
                System.out.println(name);
                dir = new File(name);
                if(!dir.exists()){
                    dir.mkdir();
                    break;
                }
                index++;
            }
        }
        System.out.println("目录创建完毕");
    }
}