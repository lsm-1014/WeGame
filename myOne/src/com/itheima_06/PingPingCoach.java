package com.itheima_06;

//�����ƹ���������
public class PingPingCoach extends Coach implements SpeakEnglish{

    public PingPingCoach() {
    }

    public PingPingCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("ƹ�����������ν���ͷ���");
    }

    @Override
    public void eat() {
        System.out.println("ƹ��������Դ�ײˣ���С����");
    }

    @Override
    public void speak() {
        System.out.println("ƹ�������˵Ӣ��");
    }
}
