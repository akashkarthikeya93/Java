import java.util.Arrays;

public class CyclicSort {
    
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicSort(int[] nums){
    {
            int i=0;
            while(i<nums.length){
                int ci=nums[i]-1;
            if(nums[i]!=nums[ci])
            swap(nums,i,ci);
            else
            i++;
        }
    }
        
    }
    private static void swap(int[] nums, int first, int second) {
       int temp=nums[first];
       nums[first]=nums[second];
       nums[second]=temp;
    }
}
