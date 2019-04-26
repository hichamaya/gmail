package aya.com.yassin;

import java.util.Scanner;

public class chalanges_04_secondes {
    Scanner scanner;

    public chalanges_04_secondes() {
        scanner = new Scanner(System.in);
    }

    double getSpeed() {
        System.out.println("enter the speed");
        return  scanner.nextDouble();
    }
    double houre ()
    {
        System.out.println("enter the houre");
        return scanner.nextDouble();
    }
    double minute ()
    {
        System.out.println("enter the minute");
        return scanner.nextDouble();
    }
    double secondes ()
    {
        System.out.println("enter the secondes");
        return scanner.nextDouble();
    }
    double calulateDistance (double speed,double houre, double minute,double secondes)
    {
        return  speed * houre * minute * secondes;
    }
    void  welcome () {
        System.out.println("welcome my friends");
        System.out.println("please enter the speed and time");

    }
    void  runProgrammeSecondes() {
        welcome();
        double speed    = getSpeed();
        double houre    = houre();
        double minute   = minute();
        double secondes = secondes();
        double resulte  = calulateDistance(speed,houre,minute,secondes);
        System.out.println("the distance the car is " + resulte);

    }
}
