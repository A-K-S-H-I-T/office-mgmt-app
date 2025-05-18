package com.learning.OfficeManagementApp.model;

public class Manager {
    private int managet_id;
    private String name;
    private int age;
    private int number_of_reportees;
    private String department;

    public Manager() {
    }

    public Manager(int managet_id, String name, int age, int number_of_reportees, String department) {
        this.managet_id = managet_id;
        this.name = name;
        this.age = age;
        this.number_of_reportees = number_of_reportees;
        this.department = department;
    }

    public int getManaget_id() {
        return managet_id;
    }

    public void setManaget_id(int managet_id) {
        this.managet_id = managet_id;
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

    public int getNumber_of_reportees() {
        return number_of_reportees;
    }

    public void setNumber_of_reportees(int number_of_reportees) {
        this.number_of_reportees = number_of_reportees;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
