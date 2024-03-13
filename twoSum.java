class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pokus;
        int[] vysledek = new int[2];
        for(int i = 0; i < nums.length; i++){
            pokus = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(pokus+nums[j] == target){
                    vysledek[0] = i;
                    vysledek[1] = j;
                }
            }
        }
        return vysledek;
    }
}
