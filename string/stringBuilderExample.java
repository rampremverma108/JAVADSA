//here the use of StringBuilder to reduce complexity of code
import java.util.*;

public class stringBuilderExample{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}