package Week_1.Day_2;

public class maxSubarray{
    public int[] twoSum(int[] nums, int t) {
        int [] res=new int[2];
        int z=t;
        for(int i=0;i<nums.length;i++){
             z=z-nums[i];
            for(int j=i+1;j<nums.length;j++){  
                 if((z-nums[j])==0){
                    res[0]=i;
                    res[1]=j;
                 }
            }
             z=t;   
            
        }
        return res;
    }
} 
    
