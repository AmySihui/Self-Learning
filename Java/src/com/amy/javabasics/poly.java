package com.amy.javabasics;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class poly {
    public static void main(String[] args) {
        //test1.num = 5;
        //test1.setNum(10);

        //System.out.println(Recursion.feb(5));

       //Character.isDigit('a');

       String str1 = "hello";
       String str2 = "world";

       String str3 = str1.concat(str2);
        System.out.println(str3);

    }
}

class test1 {
    static int num;

    public static int meth() {
        return num += num;
    }

    public test1() {
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        test1.num = num;
    }
}

class ArraysUtils {

    /*
   构造方法用private修饰

   工具类中的成员都是静态的,静态成员都是类名调用,不需要new对象
   所以工具类中的构造方法都是用private修饰

   如果构造方法被private修饰,那么在别的类中,就不能利用构造方法new对象
    */

    private ArraysUtils() {

    }

}

class Recursion {
    public static int method(int n) {
        if (n == 1) {
            return 1;
        }

        return n * method(n - 1);
    }

    public static int feb(int m) {
        if (m == 1 || m == 2) {
            return 1;
        }

        return feb(m - 2) + feb(m - 1);
    }
}
















