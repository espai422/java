package basics.types;

public class PrimitiveTypes {
    
    public static void main(String[] args) {
        // ______ Integers Numbers _______ //

        byte currentUsers = 30; // [-128,127]
        short errorCount = 17260; // [-32k,32k]
        int worldPopulation = 12341234; // [-2B, 2B] ->  2 ^ 31 = 2147483648
        long atoms = 21232131234332L; // to big so uses 8 bytes = 9.22337203685e+18
        // Also long variables need to en with an ' L ' if it's declared as before

        //_____ Floating Numbers _____ //
        float price = 45.43F; // uses 4 bytes and need to end with F if is declared as before and
        // not as a result of an operation, this also applies to a double type
        double atomWidthCm = 0.00000000000001F; // 8 bytes

        // _______ Others _____ //
        char letter = 'A'; // Single charaters always single cuotes '' and strings with double cuotes ""
        boolean ableToDrive = true; // false

    }

}
