import java.util.*;
public class gcdOfString {
    public String gcdOfStrings(String str1, String str2) {
        //case 1 : length of str2 is greater than str1 
        if(str1.length()<str2.length()){
            return gcdOfStrings(str2,str1);
        }
        //case 2 : if str1 does not start with str2
        else if(!str1.startsWith(str2)){
            return "";
        }
        //case 3 : if str2 is empty
        else if(str2.isEmpty()){
            return str1;
        }
        //case 4 : cutting of str1 starting with str2
        else{
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
    }
}
