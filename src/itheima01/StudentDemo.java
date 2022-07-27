package itheima01;

public class StudentDemo {
    public static void main(String[] args) {
//        System.out.println("helloworld");
        useStudentBuilder((name, age) -> new Student(name,age));

        useStudentBuilder(Student::new);

    }
    private static void useStudentBuilder(StudentBuilder sb){
        Student s = sb.build("狗哥", 30);
        System.out.println(s.getName()+","+s.getAge());
    }
}
