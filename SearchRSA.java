public class SearchRSA {
    
    public static void main(String[] args){
        int[] nums= {4,5,6,7,0,1,2};
        int target=4;
        System.out.print(search(nums,target));
    }
    //not works for duplicate values
    static int search(int[] nums,int target){
        int pivot=pivot(nums);
        if(pivot==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if(nums[pivot]==target)
        return pivot;
        else if(target>=nums[0])
        return binarySearch(nums, target, 0, pivot-1);
        else
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    
    static int pivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end &&nums[mid]>nums[mid+1]){
               //in[4,5,6,7,0,1,2] it is clear that
               // the mid is greater than mid+1 and only those two ele
               // are in ascending order
                return mid;
            }
            else if(mid>start &&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target== nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
        
    }
}
