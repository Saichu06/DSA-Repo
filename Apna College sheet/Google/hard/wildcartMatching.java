class wildcartMatching {

    public boolean isMatch(String s, String p) {

        int n = s.length();
        int m = p.length();

        Boolean[][] dp = new Boolean[n + 1][m + 1];

        return helper(n, m, s, p, dp);
    }

    private boolean helper(int i, int j, String s, String p, Boolean[][] dp) {

        if(i == 0 && j == 0){
            return true;
        }

        // Pattern exhausted but string remains
        if(j == 0){
            return false;
        }

        // String exhausted
        if(i == 0){
            return check(j, p);
        }

        // Already calculated
        if(dp[i][j] != null){
            return dp[i][j];
        }

        char sc = s.charAt(i - 1);
        char pc = p.charAt(j - 1);

        boolean ans;

        // Character match or '?'
        if(pc == sc || pc == '?'){

            ans = helper(i - 1, j - 1, s, p, dp);

        }

        // '*'
        else if(pc == '*'){

            // '*' matches empty OR one/more characters
            ans = helper(i, j - 1, s, p, dp)
                || helper(i - 1, j, s, p, dp);

        }

        else{
            ans = false;
        }

        dp[i][j] = ans;

        return ans;
    }

    private boolean check(int j, String p){

        for(int i = 0; i < j; i++){

            if(p.charAt(i) != '*'){
                return false;
            }
        }

        return true;
    }
}