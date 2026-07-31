class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int prefix[]=new int[len];
        prefix[0]=1;
        int suffix[]=new int[len];
        suffix[len-1]=1;
        int fin[]=new int[len];
        for(int i=1;i<len;i++){
                prefix[i]=nums[i-1]*prefix[i-1];
                suffix[len-i-1]=nums[len-i]*suffix[len-i];
        }
        for(int i=0;i<len;i++){
            fin[i]=prefix[i]*suffix[i];
        }
        return fin;

    }
}  
