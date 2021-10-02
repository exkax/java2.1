package com.company;

public class Thor extends Thony{
    private int age = 60;
    private String father;

    public Thor(int age, String grandfather, com.company.uniqueness uniqueness) {
        super(age, grandfather, uniqueness);
    }
    public String F(String father){
        return "я отец";
    }
    public final String F(int age){
        return "я папа";
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getFather() {
        return father;
    }




}
