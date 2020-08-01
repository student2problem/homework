package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个文件名");
        String filename = console.next();
        File file = new File(filename);
        if(!file.exists()){
            file.createNewFile();
        }else {
            int index = 1;
            String name = filename.substring(0,filename.indexOf("."));
            String end = filename.substring(filename.indexOf(".")+1);
            while (true){
                filename  = name+"_副本"+index+end;
                System.out.println(filename);
                file = new File(filename);
                if(!file.exists()){
                    file.createNewFile();
                    break;
                }
                index++;
            }
        }
        System.out.println("文件创建完毕");
    }

}
