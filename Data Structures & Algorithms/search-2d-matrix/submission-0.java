class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length;i++){
            int high = matrix[0].length-1;
            int low = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(target == matrix[i][mid])
            return true;
            if(target > matrix[i][mid])
            low = mid +1;
            else
            high = mid-1;
        }
        }
        return false;
    }
}
