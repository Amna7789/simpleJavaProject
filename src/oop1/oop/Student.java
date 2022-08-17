package oop1.oop;

public class Student extends Human {

    private float gcpa;

    Student() {
        super();
        gcpa = 0.0f;
    }

    Student(String name, int age, String color, float gcpa ) {
        super(name, age, color);
        this.gcpa = gcpa;
    }

    public float getGcpa() {
        return gcpa;
    }
    public void setGcpa(float gcpa) {
        this.gcpa = gcpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", gcpa=" + getGcpa() +
                '}';
    }

    @Override
    public void toShow(Human h) {
        System.out.println(h.toString());
    }
}