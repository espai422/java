package basics.types;

import java.awt.*;
import java.util.concurrent.CountDownLatch;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // Primitive types memory management
        // if x gets modified y content doesn't change
        byte x = 2;
        byte y = x;
        x = 1;
        System.out.println(x); // will print 1
        System.out.println(y); // will print 2

        // Reference types memory management
        // it doesn't matter what a Point is, it's just an example of Reference type object

        Point point1 = new Point(1,1);
        Point point2 = point1;
        Point point3 = new Point(2,2);
        
        // we change point 1 x property and set it to 2
        point1.x = 2;
        point1 = point3;
        // point1 = new Point(2,2);
        System.out.println(point1); // 2,2 
        System.out.println(point2); // 2,1 we will se that point2 has also changed x to 2
        System.out.println(point3); // 2,2 

    }
}
