from core.Leetcode.twoSums import TwoSums
from hamcrest import assert_that, contains_inanyorder
import unittest


class TwoSumsTest(unittest.TestCase):
    def setUp(self) -> None:
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

    def test_bruteforce(self):
        # Setup - none
        # Execute
        for testcase in self._TestCases:
            actual = TwoSums.bruteforce(testcase["nums"], testcase["target"])
            # Evaluate
            expected = testcase["expected"]
            assert_that(actual, contains_inanyorder(*expected))

    def test_optimized(self):
        # Setup - none
        # Execute
        for testcase in self._TestCases:
            actual = TwoSums.optimized(testcase["nums"], testcase["target"])
            # Evaluate
            expected = testcase["expected"]
            assert_that(actual, contains_inanyorder(*expected))


if __name__ == '__main__':
    unittest.main()
