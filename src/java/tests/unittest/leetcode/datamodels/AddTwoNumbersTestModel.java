package unittest.leetcode.datamodels;

import support.custom_types.ListNode;

/**
 * Data class model for the AddTwoNumbersTest
 */
public class AddTwoNumbersTestModel {
    /**
     * Private variable. only set on initiation
     * l1 is a none empty ListNode
     */
    private final ListNode l1;
    /**
     * Private variable. only set on initiation
     * l2 is a none empty ListNode
     */
    private final ListNode l2;
    /**
     * Expected ListNode returned from the algorithm function
     */
    private final ListNode expected;

    /**
     *
     * @param l1 Non Empty ListNode
     * @param l2 Non Empty ListNode
     * @param expected Non Empty ListNode
     * @see ListNode
     */
    public AddTwoNumbersTestModel(ListNode l1, ListNode l2, ListNode expected){
        this.l1 = l1;
        this.l2 = l2;
        this.expected = expected;
    }

    /**
     * Getter for private variable l1
     * @return Non Empty ListNode l1
     */
    public ListNode getL1() {
        return l1;
    }

    /**
     * Getter for private variable l2
     * @return Non Empty ListNode l2
     */
    public ListNode getL2() {
        return l2;
    }

    /**
     * Getter for private variable l2
     * @return Non Empty ListNode l2
     */
    public ListNode getExpected() {
        return expected;
    }
}
