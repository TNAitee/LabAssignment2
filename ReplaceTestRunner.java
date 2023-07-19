package E2_7;

public class ReplaceTestRunner {
    public static void main(String[] args) {
        ReplaceTester replacedString = new ReplaceTester();
        System.out.println("Expected String : M!$$!$$!pp!");
        System.out.println("Actual String :" + replacedString.replaced());
    }
}
