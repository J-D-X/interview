import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,3,7,11,2,5,6,25,6,32,5,7,8,2,4,8,15};
        quickSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums,int i,int j) {
        if(i >= j) {
            return ;
        }
        int k = nums[i];
        int l = i,r = j;
        while(l < r){
            while(l < r && nums[r] >= k) {
                r--;
            }
            while(l < r && nums[l] <= k) {
                l++;
            }
            swap(nums,l,r);
        }
        nums[i] = nums[l];
        nums[l] = k;
        quickSort(nums,i,l);
        quickSort(nums,l + 1,j);
    }
    public static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
