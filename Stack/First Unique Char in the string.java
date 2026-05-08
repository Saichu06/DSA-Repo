class Solution {
    public int firstUniqChar(String str) {
        // int[] freq=new int[26];
        // for(int i=0;i<s.length();i++){
        //     freq[s.charAt(i)-'a']++;
        // }

        // for(int i=0;i<s.length();i++){
        //     if(freq[s.charAt(i)-'a']==1){
        //         return i;
        //     }
        // }

        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char c:str.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }

        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(map.get(c)==1){
        //         return i;
        //     }
        // }

        // return -1;

        // //using queue
        int[] freq=new int[26];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            q.add(i);
            freq[c-'a']++;
            while(!q.isEmpty() && freq[str.charAt(q.peek())-'a']>1){
                q.remove();
            }
        }

        if(!q.isEmpty()){
            return q.peek();
        }

        return -1;
    }
}