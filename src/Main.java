import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {5,3,7,6,2,4,8,1};
        System.out.println(Arrays.toString(bubbleSort(nums)));
        System.out.println(Arrays.toString(selectionSort(nums)));
    }


    private static int[] bubbleSort(int[] nums) {
        int n = nums.length;

        for(int i=n; i>0; i--) {
            for(int c=0; c<i-1; c++) {
                if(nums[c]>nums[c+1]) nums = swap(nums, c, c+1);
            }
        }

        return nums;
    }

    private static int[] selectionSort(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int min = i;
            for(int c=i; c<n; c++) if(nums[c]<min) min = c;
            nums = swap(nums, i, min);
        }

        return nums;
    }

    private static int[] insertionSort(int[] nums) {
        int n = nums.length;



    }

    private static int[] swap(int[] nums, int s1, int s2) {
        int temp = nums[s1];
        nums[s1] = nums[s2];
        nums[s2] = temp;
        return nums;
    }

}
