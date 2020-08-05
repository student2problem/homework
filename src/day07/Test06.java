package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入文件名");
        String fileName = console.next();
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName),"gbk"));

        System.out.println("请输入内容,输入exit时退出");
        while (true){
            String line = console.nextLine();
            if(line.equals("exit")){
                break;
            }
            pw.println(line);
        }
        System.out.println("退出程序");
        pw.close();
    }
}
