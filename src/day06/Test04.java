package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] arr = file.listFiles();
        for(File f : arr){
            if(f.isFile()){
                System.out.println("文件的名字是: "+ f.getName());
            }else {
                System.out.println("目录的名字是: "+f.getName());
            }
        }

    }
}
