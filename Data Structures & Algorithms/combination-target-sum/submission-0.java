class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        backtrack(nums,0, new ArrayList<>(), li, target);
        return li;
    }

    void backtrack(int[] nums, int index, List<Integer> curr, List<List<Integer>> li, int target){
        if(target==0){
            li.add(new ArrayList<>(curr));
            return;
        }

        if (target<0|| index==nums.length){
            return;
        }

        curr.add(nums[index]);

        backtrack(nums,index,curr,li,target-nums[index]);

        curr.remove(curr.size()-1);

        backtrack(nums,index+1,curr,li,target);
    }
}
