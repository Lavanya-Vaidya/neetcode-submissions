class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            char c = arr[i];
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
            else{
                continue;
            }
        }
        String ans = sb.toString();
        String reverse= sb.reverse().toString();
       
        if (reverse.equals(ans)){
            return true;
        }
        else {
            return false;
        }
    }
}
