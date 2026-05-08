public class Main {
    public static void main(String[] args) {
        String s="NWEESSN";

        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);

            if(dir=="N"){
                y++;
            }
            else if(dir=="S"){
                y--;
            }
            else if(dir=="E"){
                x++;
            }
            else{
                x--;
            }
        }

        int xd=x*x;
        int yd=y*y;

        return Math.sqrt(xd,yd);

    }
}