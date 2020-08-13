package UnitTest_LeetCode.DataModels;


import leetcode.TwoSums;
import java.util.ArrayList;


/***
 * Describes the data class for the TwoSums class unit tests
 * @see UnitTest_LeetCode.Tests.TwoSumsTest
 */
public class TwoSumsTestModel {
    /**
     * Nums as defined by the TwoSums class
     * @see TwoSums#getNums()
     */
    private final ArrayList<Integer> nums;
    /**
     * Target as defined by the TwoSums class
     * @see TwoSums#getTarget()
     */
    private final int target;
    /**
     * Describes the expected solution to the TwoSums class.
     * Used in the Unit Test class
     */
    private final ArrayList<Integer> expected;

    /**
     * Instantiating the data class
     * @param nums Array of integer elements
     * @param target Target integer that two elements in nums uniquely add up to.
     * @param expected Expected solution
     */
    public TwoSumsTestModel(ArrayList<Integer> nums, int target, ArrayList<Integer> expected){
        this.nums = nums;
        this.target = target;
        this.expected = expected;
    }

    /**
     * Get private class field nums
     * @return nums - Array of integer elements
     */
    public ArrayList<Integer> getNums() {
        return nums;
    }

    /**
     * Get private class field nums
     * @return target - integer variable
     */
    public int getTarget() {
        return target;
    }

    /**
     * Get private class field expected
     * @return expected - two element array describing
     * the expected Two Sums algorithm solution
     */
    public ArrayList<Integer> getExpected() {
        return expected;
    }
}
