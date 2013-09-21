/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;

        /*
        System.out.println("Give me a name.");
        name = getInputFromKeyboard();
        
        sayHello(name, 10);
        */
        
        sayHelloUntilITellYouToStop();
    }
    
    public static String getInputFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public static void sayHello(String name, int timesToSay) {
        int i = 0;
        while (i < timesToSay) {
            System.out.print(i + ": ");
            if (name.equals("Mike")) {
                System.out.println("Hey there sexy!!");           
            } else if (name.equals("Jason")) {
                System.out.println("Hey " + name + "...your drill will pierce the heavens!");
            } else {
                System.out.println("Hello " + name + "!  You are a chump and nobody likes you.  Die in a fire!");
            }
            i = i + 1;
        }
    }
    
    public static void sayHelloUntilITellYouToStop() {
        boolean shutTheFuckUp = false;
        while (!shutTheFuckUp) {
            System.out.println("Hello");
            
            System.out.println("Do you want me to shut the fuck up?");
            String answer = getInputFromKeyboard();
            if (answer.equals("yes")) {
                shutTheFuckUp = true;
            } else if (!answer.equals("no")) {
                System.out.println("You are a stupid mother fucker..." + answer + " is not yes or no!");
            }
        }
    }
}
