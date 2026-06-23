import java.util.*;

public class subString{

public static String subStringFn(String str, int si, int ei){
    String substr = "";
    for(int i =si; i<ei; i++){
        substr += str.charAt(i);
    }
    return substr;
}

public static void main(String args[]){
   String str = "HelloWorld";
   System.out.print(subStringFn(str, 3, 5));
}
}