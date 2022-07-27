package com.itheima_04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------��ӭ����ѧ������ϵͳ--------");
            System.out.println("1 ���ѧ��");
            System.out.println("2 ɾ��ѧ��");
            System.out.println("3 �޸�ѧ��");
            System.out.println("4 �鿴����ѧ��");
            System.out.println("5 �˳�");
            System.out.println("���������ѡ��");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":

                    System.exit(8);
            }
        }


    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        String sid;
        while (true){
            System.out.println("������ѧ��ѧ��:");
            sid = sc.nextLine();
        boolean flag = (isUsed(array, sid));
        if (flag) {
            System.out.println("�������ѧ���Ѿ���ʹ�ã�����������");
        } else {
            break;
        }
    }
        System.out.println("������ѧ������:");
        String name = sc.nextLine();
        System.out.println("������ѧ������:");
        String age = sc.nextLine();
        System.out.println("������ѧ����ס��:");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("���ѧ���ɹ�");
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;

    }
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("û����Ϣ���������Ϣ");
            return;
        }

        System.out.println("ѧ��\t\t\t����\t\t����\t\t��ס��");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��\t" + s.getAddress());
        }

    }
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("��������Ҫɾ����ѧ����ѧ��");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("����Ϣ�����ڣ�����������");
        } else {
            array.remove(index);
            System.out.println("ɾ��ѧ���ɹ�");
        }

    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

            System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
            String sid = sc.nextLine();

            Student s = new Student();
            s.setSid(sid);


            int index = -1;
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("����Ϣ�����ڣ�����������");
                return;
            }


        System.out.println("������ѧ��������");
        String name = sc.nextLine();
        System.out.println("������ѧ��������");
        String age = sc.nextLine();
        System.out.println("������ѧ���¾�ס��");
        String address = sc.nextLine();

        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.set(index,s);
        System.out.println("�޸�ѧ���ɹ�");
    }
}
