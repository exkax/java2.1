package com.company;

public class Thony {
    private int age = 80;
    private String grandfather;
    private uniqueness uniqueness;

    public Thony(int age, String grandfather, com.company.uniqueness uniqueness) {
        this.age = age;
        this.grandfather = grandfather;
        this.uniqueness = uniqueness;
    }

    public int getAge() {
        return age;
    }

    public String getGrandfather() {
        return grandfather;
    }

    public com.company.uniqueness getUniqueness() {
        return uniqueness;
    }
    public String GF(){
        return "я дед";
    }
}
