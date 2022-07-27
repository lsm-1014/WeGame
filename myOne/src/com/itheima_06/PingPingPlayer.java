package com.itheima_06;

//具体的乒乓球运动员类
public class PingPingPlayer extends Player implements SpeakEnglish{

    public PingPingPlayer() {
    }

    public PingPingPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
