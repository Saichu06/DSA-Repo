public class lemonade {
    int[] bills={5,5,5,10,20};
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int n=bills.length;
        for(int i=0;i<n;i++){
            int bill=bills[i];

            //giving change
            if(bill==5)  five++;
            else if(bill==10){
                if(five==0) return false;
                else{
                    five--;
                }
                ten++;
            }
            else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3) five=five-3;
                else{
                    return false;
                }
            }
        }

        return true;
    }
}
