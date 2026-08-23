class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result = new int[2];
        int duplicate = 0;
        int missing = 0;
        for(int i = 1; i <= nums.length; i++){
            int count = 0;
            for(int num : nums){
                if(num == i){
                    count++;
                }
            } 
            if(count == 2){
                duplicate = i;
            }
            if(count == 0){
                missing = i;
            }
        }
        result[0] = duplicate;
        result[1] = missing;
        return result;
    }
}