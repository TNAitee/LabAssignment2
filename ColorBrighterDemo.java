package E2_10;
import java.awt.Color;
public class ColorBrighterDemo {
    public static void main(String[] args) {
        Color brightColor = new Color(50, 100, 150);
        Color brighter = brightColor.brighter();
        System.out.println("The value of Red, Green and Blue: " + brighter.getRed())  ;
        System.out.println("The value of Green: " + brighter.getGreen());
        System.out.println("The value of Blue: " + brighter.getBlue());
    }
}
