package main;

import model.MyDate;

/**
 * Created by wookie on 5/17/16.
 */
public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(1, 2, 3);
        System.out.println(date1);
        date1.increase();
        System.out.println(date1);

        MyDate date2 = date1.clone();
        System.out.println(date2);

        date1.setDay(100);
        System.out.println(date1);
        System.out.println(date2);

        date2.setDay(365);
        System.out.println(date2);

        date2.increase();
        System.out.println(date2);
    }
}
