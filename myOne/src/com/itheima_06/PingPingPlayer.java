package com.itheima_06;

//�����ƹ�����˶�Ա��
public class PingPingPlayer extends Player implements SpeakEnglish{

    public PingPingPlayer() {
    }

    public PingPingPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
    }

    @Override
    public void eat() {
        System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
    }

    @Override
    public void speak() {
        System.out.println("ƹ�����˶�Ա˵Ӣ��");
    }
}
