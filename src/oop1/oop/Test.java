package oop1.oop;

import oop1.oop.Student;

public class Test {

    public static void main(String[] args) {

        final float pi = 3.14f;

        /*Teacher t = new Teacher();
        t.setAge(30);
        t.setName("Usman");
        t.setSalary(50000);
        System.out.println(t.toString());

        Student s = new Student();
        s.setName("Amna");
        s.setAge(22);
        s.setColor("white");
        s.setGcpa(3.59f);
        System.out.println(s.toString());*/

       Student s = new Student();
       System.out.println(s.toString());

        Student s1 = new Student("Usman1", 25, "Brown", 3.3f);
        System.out.println(s1.toString());


//        System.out.println(h.toString());
//        h = new Teacher();
//        System.out.println(h.toString());

        //Student s = new Student();

    }
    
}
