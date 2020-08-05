package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src"+File.separator+
                "main"+File.separator+
                "java"+File.separator+
                "day07"+ File.separator+
                "Test05.java");
        InputStreamReader isr = new InputStreamReader(fis);

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Test05.java"));

        int i = -1;
        while ((i=isr.read())!=-1){
            osw.write(i);
        }
        isr.close();
        osw.close();
    }
}
