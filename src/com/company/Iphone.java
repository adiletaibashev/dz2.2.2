package com.company;

public class Iphone extends Fone{
    private int camera;
    public Iphone(String name, int age,int camera) {
        super(name, age);
        this.camera = camera;
    }

    public int getCamera() {
        return camera;
    }

    @Override
    public void getinfo() {
        System.out.println("\nname " + getName() +
                "\nyear " + getAge() +
                "\ncamera " + getCamera());
    }
}
