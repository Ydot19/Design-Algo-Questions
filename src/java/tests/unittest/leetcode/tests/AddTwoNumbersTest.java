package unittest.leetcode.tests;

import unittest.leetcode.datamodels.AddTwoNumbersTestModel;
import leetcode.AddTwoNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import support.custom_types.ListNode;

import java.util.ArrayList;

/**
 * Test Class for the AddTwoNumbers.java class
 * @see AddTwoNumbers
 * @see AddTwoNumbersTestModel
 * @author Yaadata Abdalhalim
 */
public class AddTwoNumbersTest {
    /**
     * TestCases variable
     * Used to hold all the test cases
     */
    private final ArrayList<AddTwoNumbersTestModel> TestCases = new ArrayList<>();

    /**
     * Initializing the testcases
     */
    public AddTwoNumbersTest(){
        /*
        Case 1:
            l1: (2 -> 4 -> 3)
            l2: (5 -> 6 -> 4)
            example:
             342 + 465 = 807
            expected: (7 -> 0 -> 8)
         */
        this.TestCases.add(
                new AddTwoNumbersTestModel(
                        new ListNode(
                                2,
                                new ListNode(
                                        4,
                                        new ListNode(
                                                3
                                        )
                                )
                        ),
                        new ListNode(
                                5,
                                new ListNode(
                                        6,
                                        new ListNode(
                                                4
                                        )
                                )
                        ),
                        new ListNode(
                                7,
                                new ListNode(
                                        0,
                                        new ListNode(
                                                8
                                        )
                                )
                        )
                )
        );

        /*
        Case 2:
            l1: (4)
            l2: (6)
            example:
             4 + 6 = 10
            expected: (0 -> 1)
         */
        this.TestCases.add(
                new AddTwoNumbersTestModel(
                        new ListNode(
                                4
                        ),
                        new ListNode(
                                6
                        ),
                        new ListNode(
                                0,
                                new ListNode(
                                        1
                                )
                        )
                )
        );

        /*
          Case 3:
            l1: (7 -> 4 -> 8)
            l2: (2 -> 9 -> 9)
            explain:
                847 + 992 = 1839
            expected: (9 -> 3 -> 8 -> 1)
           */
        this.TestCases.add(
                new AddTwoNumbersTestModel(
                        new ListNode(
                                7,
                                new ListNode(
                                        4,
                                        new ListNode(
                                                8
                                        )
                                )
                        ),
                        new ListNode(
                                2,
                                new ListNode(
                                        9,
                                        new ListNode(
                                                9
                                        )
                                )
                        ),
                        new ListNode(
                                9,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                8,
                                                new ListNode(
                                                        1
                                                )
                                        )
                                )
                        )
                )
        );
    }

    /**
     * Used to test the AddTwoNumbers.java class BruteForce method
     * @see AddTwoNumbers#BruteForce(ListNode, ListNode)
     */
    @DisplayName("AddTwoNumbers Test: BruteForce")
    @Test
    void BruteForceTest(){
        // Set Up - None
        for (AddTwoNumbersTestModel testCase: this.TestCases){
            // Execute
            ListNode actual = AddTwoNumbers.BruteForce(testCase.getL1(), testCase.getL2());
            // Evaluate
            ListNode expected =testCase.getExpected();
            while (expected != null) {
                Assertions.assertEquals(expected.val, actual.val);
                expected = expected.next;
                actual = actual.next;
            }
        }

    }

    /**
     * Used to test the AddTwoNumbers.java class Optimized method
     * @see AddTwoNumbers#Optimized(ListNode, ListNode)
     */
    @DisplayName("AddTwoNumbers Test: Optimized")
    @Test
    void OptimizedTest(){
        // Set Up - None
        for (AddTwoNumbersTestModel testCase: this.TestCases){
            // Execute
            ListNode actual = AddTwoNumbers.Optimized(testCase.getL1(), testCase.getL2());
            // Evaluate
            ListNode expected =testCase.getExpected();
            while (expected != null) {
                Assertions.assertEquals(expected.val, actual.val);
                expected = expected.next;
                actual = actual.next;
            }
        }

    }
}
