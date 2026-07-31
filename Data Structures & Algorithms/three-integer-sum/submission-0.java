class Solution {
    public List<List<Integer>> threeSum(int[] nums) {   
        Set<List<Integer>> sum=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int target=0-nums[i];
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(set.contains(nums[j])){
                    List<Integer> trip=Arrays.asList(nums[i],target-nums[j],nums[j]);
                    Collections.sort(trip);
                    sum.add(trip);
                }
                set.add(target-nums[j]);
            }
        }
        return new ArrayList<>(sum);
    }
}
