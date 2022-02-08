package com.company;

public class Samsung extends Fone{
    private String processor;
    public Samsung(String name, int age, String processor) {
        super(name, age);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public void getinfo() {
        System.out.println("\nname " + getName() +
                "\nyear " + getAge() +
                "\nprocessor " + getProcessor());
    }
}
