package com.company;

public class Locky extends Thor {
    private int age = 40;
    private String son;


    public Locky(int age, String grandfather, com.company.uniqueness uniqueness, int age1, String son) {
        super(age, grandfather, uniqueness);
        this.age = age1;
        this.son = son;
    }



    @Override
    public int getAge() {
        return age;
    }

    public String getSon() {
        return son;
    }

    @Override
    public String F(String father) {
        return super.F(father);
    }
}
