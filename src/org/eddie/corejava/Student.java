package org.eddie.corejava;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getMajor()
    {
        return major;
    }

    @Override
    public String getDescription() {
        return this.getName() + " is a student major in " + major;
    }
}
