package com.chen;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!!!");
        //new Person().hello(); //如果要重複使用，此寫法就會取不到這個物件
        Person p = new Person();
        p.hello();
        int age = 35;
        Integer age2 = 20;
//        age2.intValue();
//        age2.doubleValue();
        System.out.println("年齡"+ age2.doubleValue() );
        char c = 'm';
        Character c2 = 'n';
        byte b = 120;
        
        float weight = 66.5f;
        float hight = 170f;
        Float hight2 = 175f;
        //hight2.intValue();
        System.out.println(" xx : " + hight2);
        boolean adult = true;
        boolean enroll = false;
        String name = "Grete";

    }

}
