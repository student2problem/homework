package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入一个计算表达式: ");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        int index = 0;
        if((index=str.indexOf("+"))>0){
            double num1 = Double.parseDouble(str.substring(0,index));
            double num2 = Double.parseDouble(str.substring(index+1));
            System.out.println(str+"="+(num1+num2));
        }
        else if((index=str.indexOf("-"))>0){
            double num1 = Double.parseDouble(str.substring(0,index));
            double num2 = Double.parseDouble(str.substring(index+1));
            System.out.println(str+"="+(num1-num2));
        }
        else if((index=str.indexOf("*"))>0){

            double num1 = Double.parseDouble(str.substring(0,index));
            double num2 = Double.parseDouble(str.substring(index+1));
            System.out.println(str+"="+(num1*num2));
        }
        else if((index=str.indexOf("/"))>0){

            double num1 = Double.parseDouble(str.substring(0,index));
            double num2 = Double.parseDouble(str.substring(index+1));
            if(num2==0){
                System.out.println("除数不能为0");
                return;
            }
            System.out.println(str+"="+(num1/num2));
        }

    }

}
