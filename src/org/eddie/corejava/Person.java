package org.eddie.corejava;

public abstract class Person {
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract String getDescription();
}
