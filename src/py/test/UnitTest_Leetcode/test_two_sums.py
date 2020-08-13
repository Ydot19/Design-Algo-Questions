from core.Leetcode.two_sums import TwoSums
from hamcrest import assert_that, contains_inanyorder
import unittest


class TwoSumsTest(unittest.TestCase):
    """
    TwoSums uses the unittest.TestCase module to provide a testsuite to
    determine if the TwoSums static class methods are functioning as expected
    """
    def setUp(self) -> None:
        """
        Set up test cases for two sums algorithm
        :returns None
        """
        self._TestCases = [
            {
                "nums": [3, 2, 4],
                "target": 6,
                "expected": [1, 2]
            },
            {
                "nums": [3, 3],
                "target": 6,
                "expected": [0, 1]
            },
            {
                "nums": [3, 4, 1, 4],
                "target": 8,
                "expected": [1, 3]
            }
        ]

    def test_bruteforce(self) -> AssertionError:
        """
        Tests the two_sums.py TwoSums.bruteforce static method. Raises assertion error if test fails

        :returns AssertionError [Test fails] or None [Test passes]

        See - `core.Leetcode.two_sums.TwoSums.bruteforce`

        """
        # Setup - none
        # Execute
        for testcase in self._TestCases:
            actual = TwoSums.bruteforce(testcase["nums"], testcase["target"])
            # Evaluate
            expected = testcase["expected"]
            assert_that(actual, contains_inanyorder(*expected))

    def test_optimized(self) -> AssertionError:
        """
        Tests the two_sums.py TwoSums.optimized static method. Raises assertion error if test fails

        :returns AssertionError [Test fails] or None [Test passes]

        See - `core.Leetcode.two_sums.TwoSums.optimized`
        """
        # Setup - none
        # Execute
        for testcase in self._TestCases:
            actual = TwoSums.optimized(testcase["nums"], testcase["target"])
            # Evaluate
            expected = testcase["expected"]
            assert_that(actual, contains_inanyorder(*expected))


if __name__ == '__main__':
    unittest.main()
