package com.itheima_05;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setName("����");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Dog("����", 4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();


    }
}
