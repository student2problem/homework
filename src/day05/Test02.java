package day05;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {/*
        Deque<Integer> dq = new LinkedList<>();
        dq.push(1);
        dq.push(2);
        dq.push(3);
        dq.push(4);
        dq.push(5);
        System.out.println(dq);
        int flag = dq.size();
        for(int i=0;i<flag;i++){
            System.out.println(dq.pop());  //dq.size()会改变
        }*/
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=5;i++){
            stack.push(i);
        }
        int flag = stack.size();
        System.out.println(stack);
        for(int i=0;i<flag;i++){
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
