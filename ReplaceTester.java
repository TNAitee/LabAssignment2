package E2_7;

public class ReplaceTester {
    private String name;
    public ReplaceTester(){
        name = "Mississippi";
    }
    public String replaced(){
        String newStateName = null;
        newStateName = name.replace("i","!").replace("s","$");
        return newStateName;
    }
}
