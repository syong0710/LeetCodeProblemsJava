import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TwoSum {
    private static int[] inputArray = {1, 3, 9, 2, 11, 4, 6, 5, 0};
    private static int sumTarget = 11;

    public static List<Integer> twoSum(int[] nums, int target){
        List<Integer> results = new ArrayList<>();
        if (nums.length==0 || nums == null){
            return null;
        }
        Map<Integer, Integer> myMap = new HashMap<>(); // HashMap <Key, Value>
        for (int i=0; i<nums.length;i++){
            int ikey = target - nums[i];
            if(myMap.containsKey(ikey)){
                results.add(i); // the size of a list can be extended
                results.add(myMap.get(ikey)); // get the value using the given key
                System.out.println(nums[i] + " + " + nums[myMap.get(ikey)] + " = " + target);
            }
            else myMap.put(nums[i], i); // store the index(i) with key (nums[i])
        }
        return results;
    }

    public static void main(String[] arg){
        System.out.println("The input array: " + Arrays.toString(inputArray));
        System.out.println("The sum of two numbers: " + sumTarget);
        System.out.println("The elements: " + (twoSum(inputArray, sumTarget)));

    }

}
