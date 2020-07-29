package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        Method2 method2 = new Method2();

        Thread t1 = new Thread(method1);
        Thread t2 = new Thread(method2);

        t1.start();
        t2.start();
    }
}
class  Method1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("你好"+(i+1));
        }
    }
}

class  Method2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("再见"+(i+1));
        }
    }
}
