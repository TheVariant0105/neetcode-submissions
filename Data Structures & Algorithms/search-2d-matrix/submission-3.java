class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][matrix[0].length-1]){
                    int start1=0;
                    int end1=matrix[0].length-1;
                    while(start1<=end1){
                        int mid1=start1+(end1-start1)/2;
                        if(target==matrix[mid][mid1]){
                            return true;
                        }
                        if(target>matrix[mid][mid1]){
                            start1=mid1+1;
                        }else{
                            end1=mid1-1;
                        }
                    }
            }
            if(target<matrix[mid][0]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
