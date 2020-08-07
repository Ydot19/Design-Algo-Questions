package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    private ArrayList<Integer> nums;
    private int target;

    public TwoSums(ArrayList<Integer> nums, int target){
        this.nums = nums;
        this.target = target;
    }

    public ArrayList<Integer> getNums() {
        return nums;
    }

    public void setNums(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

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
