class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int area=0;
        while(start<end){
            int cur_area=(end-start)*Math.min(heights[start],heights[end]);
            area=Math.max(area,cur_area);
            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return area;
    }
}
