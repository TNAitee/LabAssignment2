package E2_4;


import java.awt.*;

public class PerimeterTesterRunner {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(2,5,6,7);
            PerimeterTester area = new PerimeterTester();
            System.out.println(area.getPerimeter((int)rectangle.getHeight(),(int)rectangle.getWidth()));
        }
    }

