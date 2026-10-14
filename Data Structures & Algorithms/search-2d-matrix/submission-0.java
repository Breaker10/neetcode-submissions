class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int l = 0;
            int h = matrix[0].length - 1;
            while(l <= h){
                int c  = matrix[i][(h + l) / 2];
                if(c > target){
                    h = (h + l) / 2 - 1;
                }else if( c < target){
                    l = (h + l) / 2 + 1;
                }
                if(c == target){
                    return true;
                }
            }
        }
        return false;
    }
}
