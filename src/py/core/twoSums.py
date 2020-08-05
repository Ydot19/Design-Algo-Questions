from typing import List


class TwoSums:
    @staticmethod
    def bruteforce(nums: List[int], target: int) -> List[int]:
        """
        Used to collect two sums algo question by traversing a list twice
        Worst case O(n^2)
        :param nums: Array of integers
        :param target: target amount
        :return:
        """
        nums_length = len(nums)  # length of array
        index = 0
        for num in nums:
            if index < nums_length:
                diff = target - num
                other_index = index + 1
                for nextNum in nums[other_index:]:  # slice next part of array
                    if nextNum == diff:
                        return [index, other_index]

                    other_index += 1

            index += 1

        return []

    @staticmethod
    def optimized(nums: List[int], target: int) -> List[int]:
        dict_nums = {}

        for index, num in enumerate(nums):
            diff = target - num

            if diff in dict_nums:
                return [index, dict_nums[diff]]

            dict_nums[num] = index



