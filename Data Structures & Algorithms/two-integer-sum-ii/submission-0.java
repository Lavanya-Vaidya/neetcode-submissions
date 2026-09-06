class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            int need = target - numbers[i];
            if (mp.containsKey(need)){
                return new int[]{mp.get(need),i+1};
            }
            mp.put(numbers[i],i+1);
        }
        return new int[0];

    }
}
