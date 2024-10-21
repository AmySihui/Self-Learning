package com.amy.javabasics.interface_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
/*        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();

        USB.methodSta();

        System.out.println(USB.NUM);

        Person p1 = new Person();
        p1.eat();
        //Person.Mouse mo = new Person.Mouse();
        //mo.open();

        Person.Mouse mouse1 = new Person().new Mouse();
        mouse1.open();

        new USB() {

            @Override
            public void open() {
                System.out.println("usb open");
            }

            @Override
            public void close() {
                System.out.println("usb close");
            }
        }.open();*/

        method01(new USB() {
            @Override
            public void open() {
                System.out.println("usb open");
            }

            @Override
            public void close() {
                System.out.println("usb close");
            }
        });



    }

    public static void method01(USB usb) {
        usb.open();
        usb.close();
    }
}
