package E2_8;

public class HelloPrinting {

    public static void main(String[] args)
    {
        String string = "Hello, World!" ;
        String newString ;
        string = string.replace("e", "@") ;
        string = string.replace("o", "e") ;
        newString =string.replace("@", "o") ;
        System.out.println("Expect: Holle, Werld!") ;
        System.out.println("Replaced string: " + newString) ;

    }
}
