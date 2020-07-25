package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i=0;i<10;i++){
            list.add(ran.nextInt(100));
        }

        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
