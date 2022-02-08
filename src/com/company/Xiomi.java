package com.company;

public class Xiomi extends Fone{
    private int mach;
    public Xiomi(String name, int age,int mach) {
        super(name, age);
        this.mach = mach;
    }

    public int getMach() {
        return mach;
    }

    @Override
    public void getinfo() {
        System.out.println("\nname " + getName()+
                "\nyear " + getAge() +
                "\nbotery " + getMach());
    }
}
