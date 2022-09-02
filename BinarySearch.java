import java.util.Arrays;

public class BinarySearch {
    private static int[] intArray = {1, 3, 5, 7, 12, 24, 38, 55};
    private static int intTarget = 1;


    // The closed range [leftPointer, rightPointer]
    // * use while(leftPointer<=rightPointer), since leftPoint = RightPointer is meaningful
    //* if (xxx), use middle -1 or +1 since nums[midPoint] is not the target for sure!
    private static int search(int[] nums, int target){
        // avoid the too small/big target
        if (target<nums[0] || target>nums[nums.length-1]) {
            return -1;
        }
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        while(leftPointer <= rightPointer){
            int midPointer = leftPointer + (rightPointer-leftPointer)/2;
            if(nums[midPointer]==target)
                return midPointer;
            else if (nums[midPointer]<target)
                leftPointer = midPointer +1;
            else if (nums[midPointer]>target)
                rightPointer = midPointer-1;
        }
        // After the while loop if nothing is found, return -1
        return -1;
    }

    public static void main(String[] arg){
        System.out.println("The input array: " + Arrays.toString(intArray) + "; the target is: " + intTarget);
        System.out.println("Search result: the index is " + search(intArray, intTarget ));
    }
}
