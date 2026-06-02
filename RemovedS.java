class RemovedS {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int i=0;
        int j=0;
        while(j<nums.length){
           if(nums[i]==nums[j]){
            j++;
           }
           else if(nums[i]!=nums[j]){
              i++;
              nums[i]=nums[j];
              j++;
              c++;
           }                
        }
        return c;
    }
}
