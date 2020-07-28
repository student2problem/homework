package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}
