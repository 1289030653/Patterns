package org.eddie.corejava;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    private static int nextId = 1;
    private double salary;
    private int id;
    private LocalDate hireDay;

    public Employee(String name, double s, int year, int month, int day)
    {
        super(name);
        salary = s;
        id = 0;
        hireDay = LocalDate.of(year, month, day);
    }

    public static int getNextId() {
        return nextId;
    }

    @Override
    public String getDescription() {
        return this.getName() + " is a employee with a salary of " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (null == otherObject) return false;

        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;

//        return this.getName().equals(other.getName())
//                && this.getSalary() == other.getSalary()
//                && this.getHireDay().equals(other.hireDay);
        return Objects.equals(this.getName(), other.getName())
                && this.getSalary() == other.getSalary()
                && Objects.equals(this.getName(), other.getName());
    }

//    @Override
//    public int hashCode() {
//        return 7 * Objects.hashCode(getName()) +
//                11 * Double.hashCode(getSalary()) +
//                13 * Objects.hashCode(getHireDay());
//    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSalary(), this.getHireDay());
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "[name " + getName() + ",salary " + getSalary()
                + ", hireDay " + getHireDay() + "]";
    }
}
