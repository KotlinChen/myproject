package com.chen;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!!!");
        //new Person().hello(); //如果要重複使用，此寫法就會取不到這個物件
        Person p = new Person();
        p.hello();
    }

}
