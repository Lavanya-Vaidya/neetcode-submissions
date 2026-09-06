class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
            return false;
         }
         HashMap<Character,Integer> mp= new HashMap<>();
        char[] arr= s.toCharArray();
        for (int i =0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        char[] br=t.toCharArray();
        for (int i=0;i<br.length;i++){
            if (mp.containsKey(br[i])){
                mp.put(br[i],mp.get(br[i])-1);
            }
            else{
                return false;
            }
            if(mp.get(br[i])<0){
                return false;
            }
        }
        return true;
    }
}
