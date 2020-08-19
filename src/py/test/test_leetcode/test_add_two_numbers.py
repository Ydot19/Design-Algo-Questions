from core.leetcode.add_two_numbers import AddTwoNumbers
from core.support.custom_types.list_nodes import SingleLinkedNode
from hamcrest import equal_to, assert_that
from typing import List
from typing import Dict
import unittest


class AddTwoNumbersTest(unittest.TestCase):
    """
    AddTwoNumbersTest use the unittest.TestCase module to provide a testsuite to
    determine if the AddTwoNumbers static class methods are functioning as expected
    """
    def setUp(self) -> None:
        self._TestCases:  List[Dict]= []
        """
        Case 1:
            l1: (2 -> 4 -> 3)
            
            l2: (5 -> 6 -> 4)
            
            example:
             342 + 465 = 807
            
            expected: (7 -> 0 -> 8)
        
        Case 2:
            l1: (4)
            
            l2: (6)
            
            explain:
              4 + 6 = 10
            
            expected: (0 -> 1)
        
        Case 3:
            l1: (7 -> 4 -> 8)
            
            l2: (2 -> 9 -> 9)
            
            explain:
                847 + 992 = 1839
            
            expected: (9 -> 3 -> 8 -> 1)
        """
        self._TestCases.append(
            {
                "l1": SingleLinkedNode(
                    val=2,
                    next=SingleLinkedNode(
                        val=4,
                        next=SingleLinkedNode(
                            val=3,
                            next=None
                        )
                    )
                ),
                "l2": SingleLinkedNode(
                    val=5,
                    next=SingleLinkedNode(
                        val=6,
                        next=SingleLinkedNode(
                            val=4,
                            next=None
                        )
                    )
                ),
                "expected": SingleLinkedNode(
                    val=7,
                    next=SingleLinkedNode(
                        val=0,
                        next=SingleLinkedNode(
                            val=8,
                            next=None
                        )
                    )
                )
            }
        )

        self._TestCases.append(
            {
                "l1": SingleLinkedNode(
                    val=4,
                    next=None
                ),
                "l2": SingleLinkedNode(
                    val=6,
                    next=None
                ),
                "expected": SingleLinkedNode(
                    val=0,
                    next=SingleLinkedNode(
                        val=1,
                        next=None
                    )
                )
            }
        )

        self._TestCases.append(
            {
                "l1": SingleLinkedNode(
                    val=7,
                    next=SingleLinkedNode(
                        val=4,
                        next=SingleLinkedNode(
                            val=8,
                            next=None
                        )
                    )
                ),
                "l2": SingleLinkedNode(
                    val=2,
                    next=SingleLinkedNode(
                        val=9,
                        next=SingleLinkedNode(
                            val=9,
                            next=None
                        )
                    )
                ),
                "expected": SingleLinkedNode(
                    val=9,
                    next=SingleLinkedNode(
                        val=3,
                        next=SingleLinkedNode(
                            val=8,
                            next=SingleLinkedNode(
                                val=1,
                                next=None
                            )
                        )
                    )
                )
            }
        )

    def test_bruteforce(self) -> AssertionError or None:
        """
        Tests the add_two_numbers.py AddTwoNumbers.bruteforce static method.
        Raises assertion error if the test fails. Returns None if test succeeds

        :returns AssertionError [Test fails] or None [Test passes]

        see `core.leetcode.add_two_numbers.AddTwoNumbers.bruteforce`
        """
        # Setup - None
        # Exercise
        for testcase in self._TestCases:
            actual = AddTwoNumbers.bruteforce(testcase["l1"], testcase["l2"])
            # Verify
            expected = testcase["expected"]
            while expected:
                assert_that(expected.val, equal_to(actual.val))
                expected = expected.next
                actual = actual.next

    def test_optimized(self) -> AssertionError or None:
        """
        Tests the add_two_numbers.py AddTwoNumbers.optimized static method.
        Raises assertion error if the test fails. Returns None if test succeeds

        :returns AssertionError [Test fails] or None [Test passes]

        see `core.leetcode.add_two_numbers.AddTwoNumbers.optimized`
        """
        # Setup - None
        # Exercise
        for testcase in self._TestCases:
            actual = AddTwoNumbers.optimized(testcase["l1"], testcase["l2"])
            # Verify
            expected = testcase["expected"]
            while expected:
                assert_that(expected.val, equal_to(actual.val))
                expected = expected.next
                actual = actual.next


if __name__ == '__main__':
    unittest.main()
