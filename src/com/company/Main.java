package com.company;

public class Main {

    public static void main(String[] args) {
	Thor thor = new Thor(60, "Stark", uniqueness.STRONG);
    Locky locky = new Locky(40,"Scott",uniqueness.CUNNING,30, "Travis");
    Locky locky2 = new Locky(41, "Strange", uniqueness.CUNNING, 31, "Doc");
        System.out.println(thor.getAge() + " " + thor.getGrandfather() + " " + thor.getUniqueness() );
        thor.F(5);

        System.out.println(locky.getAge() + " " + locky.getGrandfather() + " " + locky.getUniqueness());
        locky.F(6);
        System.out.println(locky2.getAge() + " " + locky2.getGrandfather() + " " + locky2.getUniqueness());
        locky2.F(7);
    }


}

