import java.util.Arrays;

public class PopoSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,3,7,11,2,5,6,25,6,32,5,7,8,2,4,8,15};
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = 1;j < n - i;j++){
                if(nums[j] < nums[j - 1]) {
                    swap(nums,j,j - 1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
