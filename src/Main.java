import java.util.Arrays;

public class Main {

    private static Timer timer = new Timer();

    public static void main(String[] args) {
        int len = 10000;
        int nums[] = new int[len];
        for(int i=0; i<nums.length; i++) nums[i] = (int)(Math.random() * len);

        System.out.format("%s \t%s\n\n", "Unsorted Array:", Arrays.toString(nums));

        System.out.format("%20s \t%s\n", "Bubble Sort:", Arrays.toString(bubbleSort(nums)));
        System.out.format("%20s \t%s\n", "Selection Sort:", Arrays.toString(selectionSort(nums)));
        System.out.format("%20s \t%s\n", "Insertion Sort:", Arrays.toString(insertionSort(nums)));

    }

    private static int[] bubbleSort(int[] nums) {

        timer.start();

        for(int i=nums.length; i>0; i--) {
            for(int c=0; c<i-1; c++) {
                if(nums[c]>nums[c+1]) nums = swap(nums, c, c+1);
            }
        }

        timer.stop();
        System.out.print(timer.getElapsedTime() + " ms");
        timer.reset();

        return nums;
    }

    private static int[] selectionSort(int[] nums) {

        timer.start();

        for(int i=0; i<nums.length; i++) {
            int min = i;
            for(int c=i; c<nums.length; c++) if(nums[c]<min) min = c;
            nums = swap(nums, i, min);
        }

        timer.stop();
        System.out.print(timer.getElapsedTime() + " ms");
        timer.reset();

        return nums;
    }

    private static int[] insertionSort(int[] nums) {

        timer.start();

        for(int i=1; i<nums.length; i++) {
            int c = nums[i];
            for(int z=i-1; z>=0; z--) if(c<nums[z]) nums = swap(nums, i, z);
        }

        timer.stop();
        System.out.print(timer.getElapsedTime() + " ms");
        timer.reset();

        return nums;
    }

    private static int[] swap(int[] nums, int s1, int s2) {
        int temp = nums[s1];
        nums[s1] = nums[s2];
        nums[s2] = temp;
        return nums;
    }

}
