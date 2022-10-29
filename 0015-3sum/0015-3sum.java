class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        if(nums.length==0) return new ArrayList<>(set);
        for(int i=0; i<nums.length; i++){
            // for(int j=i+1;j<nums.length;j++){
            //     for(int k=j+1; k<nums.length;k++){
            //         if(nums[i]+nums[j]+nums[k] == 0){
            //             set.add(Arrays.asList(nums[i],nums[j],nums[k]));
            //         }
            //     }
            // }
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }
        }
        return new ArrayList<>(set);
    }
}