package aya.com.yassin;
import  java.util.Random;
import  java.util.Scanner;

public class chalanges_001 {
    String[] jokes;
    Random   random;
    Scanner  scanner;
    String   userInput;
    chalanges_001 () {
        random  = new Random();
        scanner = new Scanner(System.in);
    jokes = new String[5];
    jokes[0] = "الانسولين هي الحياة";
    jokes[1] = "السكر مرص العصر";
    jokes[2] = "العلاج التلاتي ";
    jokes[3] = "اتبع الحمية";
    jokes[4] = "الوجبات التلاتة";

    }
    void displayWelcomeMessage() {
        System.out.println("Welcome to our programme");
    }
    int getRandomIndex () {
        return random.nextInt(jokes.length);
    }
    void runProgramm() {
        do {
            userInput = scanner.nextLine();
            displayWelcomeMessage();
            int index = getRandomIndex();
            String joke = jokes[index];
            System.out.println(joke);
        }while(!userInput.equals("finish"));
    }
}

