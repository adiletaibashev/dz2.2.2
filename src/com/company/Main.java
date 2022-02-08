package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fone [] fones = {pult(Fon_Name.Samsung),pult(Fon_Name.Iphone),pult(Fon_Name.Xiomi)};
        for (int i = 0; i < fones.length; i++) {
            fones[i].getinfo();

        }

    }
    public static Fone pult (Fon_Name name){
        switch (name){
            case Samsung :
                Samsung samsung = new Samsung("samsung",2021,"axynos2100");
                return samsung;
            case Iphone:
                Iphone iphone = new Iphone("iphone",2020,12);
                return iphone;
            case Xiomi:
                Xiomi xiomi = new Xiomi("xiomi",2019,5000);
                return xiomi;


        }
        return null;
    }
}
