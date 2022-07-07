package basics.arithmeticExpressions;

public class arithmeticExpressions {
    public static void main(String[] args) {
    int result = 20 +1 -1 *1 /1;

    // we can divide two int numbers but the result is going to be an int
    // To make a division with decimal numbers we neet to use the following way
    double division = (double)10 / (double)2;

    // Counters
    int a = 1;
    a++;
    ++a;
    
    int b = 1;
    int c = b++; // b -> 2, c -> 1

    b = 1;
    c = ++b; // b -> 2, c -> 2

    a += 2;
    b -= 1;
    c *= 1;
    a /= 1;
    }
}
