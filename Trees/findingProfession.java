class findingProfession {
    public int countBits(int n){
        int count =0;
        while(n>0){
            n&=(n-1);
            count++;
        }
        return count;
    }
    public String profession(int level, int pos) {
        int bits = countBits(pos-1);
        String ans = bits%2==0 ? "Engineer" : "Doctor";
        return ans;
        // code here
        // if(level==1) return "Engineer";
        
        // if((profession(level-1 , (pos+1)/2)).equals("Engineer")){
        //     if(pos%2==1){
        //         return "Engineer";
        //     }else{
        //         return "Doctor";
        //     }
        // }else{
        //     if(pos%2==1){
        //         return "Doctor";
        //     }else{
        //         return "Engineer";
        //     }
        // }

    }
}