public class angrams{
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
     StringBuilder sb2 = new StringBuilder(str2);
     for(int i = 0; i<str1.length(); i++){
          char str1word =str1.charAt(i);
          boolean found =false;
        for(int j = 0; j< sb2.length(); j++){
            // char str2word == str2.charAt(j);
            if( str1word == sb2.charAt(j)){
                sb2.deleteCharAt(j);
                found = true;
                break;
            }
        }
            if(!found){
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
    String str1 = "race";
    String str2 = "care";
    boolean result = isAnagram(str1, str2); 
    if (result) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    
}
}