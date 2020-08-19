package unittest.leetcode.tests;

import unittest.leetcode.datamodels.TwoSumsTestModel;
import leetcode.TwoSums;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Test Class for the TwoSums.java class
 * @see TwoSums
 */
public class TwoSumsTest {
    /**
     * TestCases variable
     * Used to hold all the test cases
     */
    private final ArrayList<TwoSumsTestModel> TestCases = new ArrayList<>();

    /**
     * Initializing the testcases
     * @see TwoSumsTestModel
     */
    public TwoSumsTest(){
        this.TestCases.add(
                new TwoSumsTestModel(new ArrayList<Integer>(Arrays.asList(3, 2, 4)), 6, new ArrayList<>(Arrays.asList(1,2)))
        );

        this.TestCases.add(
                new TwoSumsTestModel(new ArrayList<Integer>(Arrays.asList(3, 3)), 6, new ArrayList<>(Arrays.asList(0,1)))
        );

        this.TestCases.add(
                new TwoSumsTestModel(new ArrayList<Integer>(Arrays.asList(3, 4, 1, 4)), 8, new ArrayList<>(Arrays.asList(1,3)))
        );
    }

    /**
     * Used to test the TwoSums.java class BruteForce method
     * @see TwoSums#BruteForce()
     */
    @DisplayName("TwoSums Test: BruteForce")
    @Test
    void BruteForceTest(){

        for(TwoSumsTestModel testCase: this.TestCases){
            // Set up
            TwoSums twoSums = new TwoSums(testCase.getNums(),testCase.getTarget());
            // Execute
            ArrayList<Integer> actual = twoSums.BruteForce();
            // Evaluate
            ArrayList<Integer> expected = testCase.getExpected();

            assertThat(actual, containsInAnyOrder(expected.toArray()));
        }
    }

    /**
     * Used to test the TwoSums.java class BruteForce class
     * @see TwoSums#Optimized()
     */
    @DisplayName("TwoSums Test: Optimized Map Lookup")
    @Test
    void OptimizedTest(){
        for(TwoSumsTestModel testCase: this.TestCases){
            // Set up
            TwoSums twoSums = new TwoSums(testCase.getNums(),testCase.getTarget());
            // Execute
            ArrayList<Integer> actual = twoSums.Optimized();
            // Evaluate
            ArrayList<Integer> expected = testCase.getExpected();

            assertThat(actual, containsInAnyOrder(expected.toArray()));
        }
    }
}
