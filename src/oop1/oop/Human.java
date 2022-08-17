package oop1.oop;

public abstract class Human {
    private String name;
    private int age;
    private String color;

    public Human() {
        name = "Amna";
        age = 20;
        color = "Brown";
    }

    public Human(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public abstract void toShow(Human h);
}
