public class OrderAgnoisiticBS {
    public static void main(String[] args){
        int[] nums={5,4,3,2,1};
        int target=2;
        System.out.print(AgnoisticBS(nums,target));
    }
    static int AgnoisticBS(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        boolean isAsc= nums[start]<nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(isAsc){
                if(target>nums[mid])
                start=mid+1;
                else
                end=mid-1;
            }
            else 
            {
                if(target>nums[mid])
                end=mid-1;
                else
                start=mid+1;
            }
    }
    return -1;

    }
}
