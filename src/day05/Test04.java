package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        //输出物理的成绩
        System.out.println(map.get("物理"));
        //设置化学96
        map.put("化学",96);
        //删除英语
        map.remove("英语");
        //遍历key
        Set<String> set = map.keySet();
        for(String key : set){
            Integer value = map.get(key);
            System.out.println(key+":" + value);
        }
        System.out.println("----------------------------------------");
        //Entry
        Set<Entry<String,Integer>> set1 = map.entrySet();
        for(Entry<String,Integer> en : set1){
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key+":"+value);
        }
        System.out.println("------------------------------------------");
        //value
        Collection<Integer> col = map.values();
        for(Integer values : col){
            System.out.println(values);
        }
    }
}
