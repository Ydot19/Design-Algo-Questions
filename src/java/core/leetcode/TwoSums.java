package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 *
 * Data Class Model for the AddTwoNumbersTest.java
 * @author Yaadata Abdalhalim
 *
 */
public class TwoSums {
    /**
     * Private class field that is used to stored
     * the array of integer elements
     */
    private final ArrayList<Integer> nums;
    /***
     * Private class field that holds the target
     * that a unique pair of integer must equal to.
     */
    private final int target;

    /**
     * Initializing the solution class
     * @param nums Array that uniquely has two elements that add up to a target
     * @param target Value of two elements in nums adds up to target
     */
    public TwoSums(ArrayList<Integer> nums, int target){
        this.nums = nums;
        this.target = target;
    }

    /**
     * Getter method
     * @return nums - private class filed
     * @see TwoSums#nums
     */
    public ArrayList<Integer> getNums() {
        return nums;
    }

    /**
     * Getter method
     * @return target - private class field
     * @see TwoSums#target
     */
    public int getTarget() {
        return target;
    }


    /**
     * Solution for Two Sums algorithm.
     * Solution ~O(n^2).
     * @return Two element integer array.
     *
     * Example:
     * nums = [3, 5, 9, 6]
     * target = 9
     *
     * returns [0, 1] because [Index 0] + [Index 1] = 3 + 5 = 9
     */
    public ArrayList<Integer> BruteForce(){
        // Initialize the array
        ArrayList<Integer> ret = new ArrayList<>();
        int numsLength = this.getNums().size();
        int outerIndex = 0;
        // Traverse through two lists
        for (Integer num: this.getNums()){
            int diff = this.getTarget() - num;
            int innerIndex = outerIndex + 1;
            // Loop through items following the current number
            for(Integer nexNum: this.getNums().subList(outerIndex + 1, numsLength)){
                if (nexNum == diff){
                    ret.addAll(Arrays.asList(outerIndex,innerIndex));
                    return ret;
                } else {
                    innerIndex += 1;
                }
            }

            outerIndex += 1;

        }
        return ret;
    }

    /**
     * Solution for Two Sums algorithm.
     * Limits the use of arrays and lookups are down via a HashMap
     * Solution ~O(n).
     * @return Two element integer array.
     *
     * Example:
     * nums = [3, 5, 9, 6]
     * target = 9
     *
     * returns [0, 1] because [Index 0] + [Index 1] = 3 + 5 = 9
     */
    public ArrayList<Integer> Optimized(){
        // Initialize the array
        ArrayList<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> numsMap = new HashMap<>();
        int index = 0;

        for (Integer num: this.getNums()){
            int diff = this.getTarget() - num;

           if(numsMap.containsKey(diff)){
               ret.addAll(Arrays.asList(index, numsMap.get(diff)));
               break;
           }

           numsMap.put(num, index);
           index++;
        }

        return ret;
    }
}
