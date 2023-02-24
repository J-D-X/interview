import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,3,7,11,2,5,6,25,6,32,5,7,8,2,4,8,15};
        process(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void process(int[] nums,int l,int r){
        if(l == r) {
            return ;
        }
        int mid = l + ((r - l) >> 1);
        process(nums,l,mid);
        process(nums,mid + 1,r);
        merge(nums,l,mid,r);
    }
    public static void merge(int[] nums,int l,int mid,int r){
        int[] arr = new int[r - l + 1];
        int p1 = l,p2 = mid + 1,i = 0;
        while(p1 <= mid && p2 <= r){
            arr[i++] = nums[p1] <= nums[p2] ? nums[p1++] : nums[p2++];
        }
        while(p1 <= mid){
            arr[i++] = nums[p1++];
        }
        while(p2 <= r){
            arr[i++] = nums[p2++];
        }
        for(int j = 0;j < arr.length;j++){
            nums[l + j] = arr[j];
        }
    }
}
