package com.ua.task2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Hello choose material
        System.out.println("Hello user :)\nEnter number of substance:\n1. Water\n2. Iron\n3. Oxygen");
        //Choose a material
        Substance substance = chooseMaterial();
        //Change temperature or quit
        changeTemperature(substance);
    }

    public static Substance chooseMaterial(){
        Substance substance = null;
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                substance = new Water();
                System.out.println("You choose a Water");
                break;
            case 2:
                substance = new Iron();
                System.out.println("You choose a Iron");
                break;
            case 3:
                substance = new Oxygen();
                System.out.println("You choose a Oxygen");
                break;
            default:
                System.out.println("You enter wrong value!");
        }
        return substance;
    }

    public static void changeTemperature(Substance substance) {
        System.out.println("If you want change temperature enter 1. For quit enter 0.");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if(answer == 1){
            System.out.println("Enter the value by which you want to change the temperature:");
            State state = substance.heatUp(scanner.nextDouble());
            System.out.println("Current state is: " + state);
            changeTemperature(substance);
        } else if(answer == 0){
            System.out.println("Have a nice day");
        } else {
            System.out.println("You enter wrong value");
            changeTemperature(substance);
        }
    }
}