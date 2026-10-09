class minParanthesisInsertion{
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;
        for(int i = 0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='('){
                open++;
            }else{
                if(i<s.length()-1 && s.charAt(i+1)==')'){
                    i++;
                }else{
                    ans++;
                }

                if(open>0) open--;
                else ans++;
            }
        }

        return ans + open*2;
    }
}