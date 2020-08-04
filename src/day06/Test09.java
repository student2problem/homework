package day06;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt",true);
        Scanner console = new Scanner(System.in);
        System.out.println("请输入内容,exit为退出");

        while (true){
            String line = console.nextLine();
            if(line.equals("exit")){
                break;
            }
            fos.write(line.getBytes());
        }
        System.out.println("再见");
        fos.close();
    }
}
