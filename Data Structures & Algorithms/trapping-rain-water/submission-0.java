class Solution {
    public int trap(int[] h) {
        if (h==null || h.length==0){
            return 0;
        }

        int l=0;
        int r= h.length-1;
        int leftMax= h[l];
        int rightMax= h[r];
        int res=0;

        while(l<r){
            if (leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,h[l]);
                res+=leftMax-h[l];
            }
            else{
                r--;
                rightMax=Math.max(rightMax,h[r]);
                res+=rightMax-h[r];
            }
        }
        return res;
    }
}
