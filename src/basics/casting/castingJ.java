package basics.casting;

public class castingJ {
    public static void main(String[] args) {
        // Implicit Casting
        short x = 1;
        int y = x + 2; // x is converted to an int and then java add the numbers

        // Decimal
        double a = 1.1;
        double b = a + 2; // 2 is converted to 2.0 an then they add up        

        // Explicit Casting
        // we can not convert a double to an int automatically because we can have a data lost
        // so we need to specifi it like in the following example
        double f = 1.1;
        int g = (int)f + 2;

        // Also can be done from char to int
        int o = 1;
        char p = (char)o;
        // ERROR
        // String portParameter = "3000";
        // int port = (int)portParameter;
    }
}
