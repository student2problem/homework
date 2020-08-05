package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        Scanner console = new Scanner(System.in);
        try {
            pw = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("note.txt"),"GBK"));
            System.out.println("请输入内容,若输入exit则退出");
            String line = null;
            while (true){
                line = console.nextLine();
                if(line.equals("exit")){
                    break;
                }
                pw.println(line);
            }
            System.out.println("退出成功");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            pw.close();
        }

    }
}
