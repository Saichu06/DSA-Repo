import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String isValid(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            freq[c-'a']++;
        }
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int f : freq){
            if(f>0){
                map.put(f, map.getOrDefault(f, 0)+1);
            }
        }
        
        if(map.size()==1) return "YES";
        if(map.size()==2){
            List<Integer> keys = new ArrayList<>(map.keySet());
            
            int f1=keys.get(0);
            int f2=keys.get(1);
            
            int c1=map.get(f1);
            int c2=map.get(f2);
            
            if((f1==1 && c1==1)|| (f2==1 && c2==1)){
                return "YES";
            }
            else if((Math.abs(f1-f2)==1) && ((f1>f2 && c1==1) || (f2>f1 && c2==1))){
                return "YES";
            }
        }
        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
