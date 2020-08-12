package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入要转码的文件名");
        String fileName = console.nextLine();
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println(file+"不存在");
        }else {

        }
    }
    //str1 文件原来的编码,str2要转换的编码
    public static void changeCharset(File file,String str1,String str2) throws IOException {
            String fileName = file.getName();
            String name = fileName.substring(0,fileName.indexOf("."));
            String postfix = fileName.substring(fileName.indexOf(".")+1);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file),str1));
            PrintWriter pw =new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(name+"_"+str2+".txt"),str2));
            String line = null;
            while ((line=br.readLine())!=null){
                    pw.println(line);
            }
            System.out.println("转码完成");
            br.close();
            pw.close();
    }
}
