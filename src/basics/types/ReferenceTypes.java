package basics.types;

import java.util.Date;

public class ReferenceTypes {
    
    public static void main(String[] args) {
        int age = 30;
        // without using the import
        java.util.Date now = new java.util.Date(); 
        // Using the import
        Date future = new Date();
    }
}
