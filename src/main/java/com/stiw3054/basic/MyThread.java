
package com.stiw3054.basic;

class MyThread extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}

/***
 * Name of t1:Thread-0
 * Name of t2:Thread-1
 * id of t1:12
 * running...
 * After changing name of t1:STIW3054
 * running...
 */