package com.itheima_06;

public class PersonDemo {
    public static void main(String[] args) {
        PingPingPlayer ppp = new PingPingPlayer();
        ppp.setName("ÍõºÆ");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("--------");

        ppp = new PingPingPlayer("ÍõºÆ",30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("---------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("¹·¸ç");
        bp.setAge(21);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("--------");

        bp = new BasketballPlayer("¹·¸ç",21);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
