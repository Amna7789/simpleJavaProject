package oop;

public class Student {
    private String name;
    private int age;
    private String color;
    private float gcpa;

    Student() {
        name = "Amna";
        age = 20;
        color = "Brown";
        gcpa = 0.0f;
    }

    Student(String name, int age, String color, float gcpa ) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gcpa = gcpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gcpa=" + gcpa +
                '}';
    }
}
