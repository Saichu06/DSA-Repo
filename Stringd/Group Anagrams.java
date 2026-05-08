class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            String freqstr=getFreqStr(str);
            if(map.containsKey(freqstr)){
                map.get(freqstr).add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freqstr,list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String getFreqStr(String str){
        char[] freq=new char[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append("#");
            sb.append(freq[i]);
        }
        return sb.toString();
    }
}