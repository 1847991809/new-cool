package qqq;

public class forxunhuan {
    public static void main(String[] args) {
 /*       for(int minute = 0; minute < 4; minute++) {
            System.out.println("0时" + minute + "分");
        }
        System.out.println("-------------");
        for(int minute = 0; minute < 4; minute++) {
            System.out.println("1时" + minute + "分");
        }
        System.out.println("-------------");
        for(int minute = 0;minute < 4; minute++) {
            System.out.println("2时" + minute + "分");
        }
        System.out.println("--------------");*/

        for (int hour = 0; hour < 24; hour++) {

            for(int minute = 0; minute < 60; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
            System.out.println("-----------");
        }
    }
}
