package qqq;

import java.util.Random;
public class Randomtest {
    public static void main(String[] args) {


        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            int number = r.nextInt(10);
            System.out.println("number" + number);
        }
        //获取一个1-100之间的随机数
        int x = r.nextInt(100) + 1;
        System.out.println(x);
    }
}
