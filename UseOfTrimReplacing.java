package E2_2;

public class UseOfTrimReplacing {

    private String str;
     public UseOfTrimReplacing() {
        str = " Once upon a time , there was a queen and she loved momos ";
     }
        public String useTrim(){
            return str.trim();
        }

        public String useReplaceAllSpaces(){
            return str.replace(" ","");
        }

    }


