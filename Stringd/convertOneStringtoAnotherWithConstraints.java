class convertOneStringtoAnotherWithConstraints {
    public boolean isItPossible(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();

        if (m != n)
            return false;

        int i = 0;
        int j = 0;

        while (i < n || j < m) {
            // to get A or B and skipping #
            while (i < n && s1.charAt(i) == '#')
                i++;
            while (j < m && s2.charAt(j) == '#')
                j++;

            // if i or j exceeds its limit
            if (i >= n && j >= m)
                break;

            if (i >= n || j >= m)
                return false;

            if (s1.charAt(i) != s2.charAt(j))
                return false;

            if (s1.charAt(i) == 'A' && i < j)
                return false;

            if (s1.charAt(i) == 'B' && i > j)
                return false;

            i++;
            j++;
        }

        return true;
    }
}