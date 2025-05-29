public class SingleEleSA {
    public static void main(String[] args) {
        int[] nums= {1,1,2,3,3,4,4,8,8};
        System.out.print(singleEle(nums));
    }
    static int singleEle(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1])
            return nums[mid];
            else if(mid%2==0&&nums[mid+1]==nums[mid]||mid%2==1&&nums[mid]==nums[mid-1])
            {
                start=mid+1;
            }
            else
            end=mid-1;
        }
        return nums[end];
    }
}
