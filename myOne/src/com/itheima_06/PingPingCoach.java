package com.itheima_06;

//具体的乒乓球教练类
public class PingPingCoach extends Coach implements SpeakEnglish{

    public PingPingCoach() {
    }

    public PingPingCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何接球和发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃大白菜，喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
