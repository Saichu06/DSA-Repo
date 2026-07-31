import java.util.Arrays;

public class oneStringBreakAnother {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean canbreaks1 = true;
        boolean canbreaks2 = true;

        int n = s1.length();
        for(int i=0;i<n;i++){
            if(str1[i]<str2[i]){
                canbreaks1=false;
            }if(str1[i]>str2[i]){
                canbreaks2=false;
            }
        }

        return canbreaks1||canbreaks2;
    }
}
