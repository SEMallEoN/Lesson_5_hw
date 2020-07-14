package ru.geekbrains.lesson_5_hw.semenov;

public class Employee {
    public String name;
    public String lastName;
    public int age;
    public int iQ;
    public String position;

    public Employee(String name, String lastName, int age, int iQ, String position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.iQ = iQ;
        this.position = position;
    }

    public void printInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + iQ + " " + position);
    }
}
