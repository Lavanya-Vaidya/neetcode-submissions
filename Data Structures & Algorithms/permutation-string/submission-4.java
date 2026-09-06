class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> count1= new HashMap<>();
        for (char c : s1.toCharArray()){
            count1.put(c,count1.getOrDefault(c,0)+1);
        }

        int need = count1.size();
        for (int i =0;i<s2.length();i++){
            Map<Character,Integer> count2 = new HashMap<>();
            int curr=0;
            for (int j=i;j<s2.length();j++){
                char s= s2.charAt(j);
                count2.put(s,count2.getOrDefault(s,0)+1);
            
            if (count1.getOrDefault(s,0) < count2.get(s)){
                break;
            }
            if (count1.getOrDefault(s,0) == count2.get(s)){
                curr++;
            }
            if (curr==need){
                return true;
            }
            }
        }
         return false;

    }
}

