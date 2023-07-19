package E2_3;

import java.awt.*;
public class AreaTesterRunner {

        public static void main(String[] args) {
           Rectangle rectangle = new Rectangle(5,5,5,8);
            AreaTester area = new AreaTester();
           System.out.println(area.getArea((int)rectangle.getHeight(),(int)rectangle.getWidth()));

        }
}
