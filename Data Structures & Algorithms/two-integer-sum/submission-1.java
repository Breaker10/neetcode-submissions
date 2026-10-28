class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0, j = 0; i < nums.length;){
            int sum = 0;
            if(i == j){
                j++;
                continue;
            }else{
                sum += nums[i];
                sum += nums[j];
            }
            
            if(sum != target){
                sum = 0;
                j++;
            }else{
                arr[0] = i;
                arr[1] = j;
                break;
            }

            if(j == nums.length){
                i++;
                j = 0;
            }


        }
        return arr;
    }
}
