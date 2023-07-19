package E2_1;

public class StringReplace {
        private String stateName;

        public StringReplace(){
            stateName = "Mississippi";
        }
        public StringReplace(String stateName) {
            this.stateName = stateName;
        }

        public int replaceI() {
            String newStateName = null;
            int newLength;
            newStateName = stateName.replace( "i" ,"ii");
            newLength= newStateName.length();
            return newLength;
            }

    public int replaceSS() {
        String newStateName = null;
        int newLength;
        newStateName = stateName.replace( "ss" ,"s");
        newLength= newStateName.length();
        return newLength;
    }
        public int calculateLength(String name){
            return name.length();
    }

}
