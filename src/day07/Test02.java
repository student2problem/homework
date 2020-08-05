package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myfile.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i = -1;
        while ((i=bis.read())!=-1){
            fos.write(i);
        }
        bis.close();
        bos.close();
    }

}
