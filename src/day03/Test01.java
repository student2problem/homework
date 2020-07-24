package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date: "+date);
        date.setTime(date.getTime()+1000l*60*60*24*3);
        System.out.println("三天后: "+date);

    }
}
