package basics.ifStatements;

public class ifStatements {
    public static void main(String[] args) {
        // If Statements
        int temp = 30;
        
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink a lot of water");
        } else if (temp > 20) {
            System.out.println("It's a normal day");
        } else {
            System.out.println("It's a cold day");
        }

        // To declare a variable it need to be inside of a block {}
        // The scope of the vare can be accessed from a more low lever scope like an if {}
        // but we can not access a variable from the main thread if it's declared in the if {}
        // we should declare the variable outside of the if {} and modify it's content in the if {}

        if (true) {
            int number = 1;
        }
        // number is not defined here

        int number;
        if (true) {
            number = 1;
        }
        // number value is 1 at this line
    }
}
