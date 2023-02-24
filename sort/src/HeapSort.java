import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,7,6,3,2};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void heapSort(int[] arr){

        // arr.length / 2 - 1:找到第一个非叶子节点对应的位置。
        for(int i = arr.length / 2 - 1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int i = arr.length - 1;i >= 0;i--){
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }
    public static void adjustHeap(int[] arr,int i,int length){
        int temp = arr[i];
        for(int k = i * 2 + 1 ;k < length;k = k * 2 + 1){
            if(k + 1 < length && arr[k] < arr[k + 1]){
                k++;
            }
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
