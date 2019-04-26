package aya.com.yassin;

import java.util.Scanner;

public class chalnges_4_hours {
    public chalnges_4_hours() {
        scanner = new Scanner(System.in);
    }

    Scanner scanner;

    double getSpeed() {
        System.out.println("enter the speed");
        return  scanner.nextDouble();
    }
    double houre ()
    {
        System.out.println("enter the houre");
        return scanner.nextDouble();
    }
    double calulateDistance (double speed,double houre) {
        return  speed * houre;
    }
    void  welcome () {
        System.out.println("welcome my friends");
        System.out.println("please enter the speed and time");

    }
    void  runProgrammeHours() {
        welcome();
        double speed = getSpeed();
        double houre = houre();
        double resulte = calulateDistance(speed,houre);
        System.out.println("the distance the car is " + resulte);



    }
}
