class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        return !(set.size()==nums.length);
    }
}