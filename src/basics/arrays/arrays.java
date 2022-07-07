package basics.arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // arrays tricky way
        int[] numbers = new int[5]; // 5 is the lenght of the array
        numbers[0] = 1;
        numbers[3] = 10;
        // by default values are 0 if is a number array
        // in case of string it's an empty string

        // modern way
        int[] modernWay = {1,2,3,4,5};
        // this array has a fix length of 5  

        // Print an array
        // We need to import java.util.Arrays and execute the method toString and pass the array we want to convert as an argument
        System.out.println(Arrays.toString(modernWay));
    }
}
