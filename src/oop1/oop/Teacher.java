package oop1.oop;

public abstract class Teacher extends Human {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public void toShow(Human h) {

    }
}
