package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles(pathname ->{
                return pathname.isFile();

        });
        for(File f :files){
            System.out.println("文件: "+ f.getName());
        }
    }

}
