package com.itheima_06;

//����������˶�Ա��
public class BasketballPlayer extends Player {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("�����˶�Աѧϰ��������Ͷ��");
    }

    @Override
    public void eat() {
        System.out.println("�����˶�Ա��ţ�⣬��ţ��");
    }


}
