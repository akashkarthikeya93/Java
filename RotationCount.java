public class RotationCount {
    public static void main(String[] args) {
        int[] nums= {6,7,2,4,5,1,0};
        int rotate=pivot(nums);
        if(rotate==-1){
            System.out.print("No Rotation");
        }
        else
        System.out.print(rotate+1);
    }
    static int pivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<=end) {
            int mid= start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start&&nums[mid-1]>nums[mid]){
            return mid-1;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    } 
}
