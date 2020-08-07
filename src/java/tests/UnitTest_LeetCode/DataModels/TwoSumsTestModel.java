package UnitTest_LeetCode.DataModels;


import java.util.ArrayList;

public class TwoSumsTestModel {
    private final ArrayList<Integer> nums;
    private final int target;
    private final ArrayList<Integer> expected;

    public TwoSumsTestModel(ArrayList<Integer> nums, int target, ArrayList<Integer> expected){
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    public ArrayList<Integer> getNums() {
        return nums;
    }

    public int getTarget() {
        return target;
    }

    public ArrayList<Integer> getExpected() {
        return expected;
    }
}
