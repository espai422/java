package basics.strings;

public class strings {
    public static void main(String[] args) {
        String old = new String("Old way to declare string");
        String ezWay = "New way to declare string" + "!!";

        // Strings are inmutable so when we modify them we need to
        // assign the new string to a new variable

        String modifiedOld = old.toUpperCase();
        old = old.toUpperCase();

        System.out.println(old);

   } 
}
