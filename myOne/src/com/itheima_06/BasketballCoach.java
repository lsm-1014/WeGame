package com.itheima_06;

//��������������
public class BasketballCoach extends Coach{

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("�����������������Ͷ��");
    }

    @Override
    public void eat() {
        System.out.println("������������⣬������");
    }
}
