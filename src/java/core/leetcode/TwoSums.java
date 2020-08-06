package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

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
        int outerCounter = 0;
        // Traverse through two lists
        for (Integer num: this.getNums()){
            int diff = this.getTarget() - num;
            int innerCounter = outerCounter + 1;
            for(Integer nexNum: this.getNums().subList(outerCounter + 1, numsLength)){
                if (nexNum == diff){
                    ret.addAll(Arrays.asList(outerCounter,innerCounter));
                    return ret;
                }
            }

            outerCounter += 1;

        }
        return ret;
    }
}
