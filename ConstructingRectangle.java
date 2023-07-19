package E2_5;

import java.awt.*;
public class ConstructingRectangle {

    public static void main(String[] args) {
        Rectangle rectanlgle1 = new Rectangle(5, 5 ,6,7);
        Rectangle rectangle2 = new Rectangle (7, 7, 10, 11);
        System.out.println("Rectangle1's width is: " + rectanlgle1.getWidth()+ " and Rectangle1's height is: " +rectanlgle1.getHeight());
        System.out.println("Rectangle2's width is: " + rectangle2.getWidth()+ " and Rectangle2's height is: " +rectangle2.getHeight());
    }
}
