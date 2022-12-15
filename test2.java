package qqq;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Random r = new Random();

        int number = r.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想猜的数字：");
        int guessNumber = sc.nextInt();

        if(guessNumber > number) {
            System.out.println("你猜的数字" + guessNumber + "大了");
        } else if(guessNumber < number) {
            System.out.println("你猜的数字" + guessNumber + "小了");
        } else {
            System.out.println("恭喜你猜中了");
        }
    }

}
