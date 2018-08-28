package org.eddie.corejava;

public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return this.bonus == other.bonus;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [bonus " + getBonus() + "]";
    }
}
