package basics.arrays;

import java.util.Arrays;

public class multidimensionalArrays {
    // this is the way to define multidimensional arrays
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        
        // print multidimensional array
        System.out.println(Arrays.deepToString(numbers));

        // modern way to decalre multidimensional string
        int[][] matrix = {{1,2,3}, {4,5,6,7}};
        System.out.println(Arrays.deepToString(matrix));
    }
    
}
