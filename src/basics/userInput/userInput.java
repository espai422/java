package basics.userInput;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        // input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.print("Your are: " + age);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Your name is: " + name);
        String bugfix = scanner.nextLine();
    }
}
