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
        outer_index = 0
        ret = []
        for num in nums:
            if outer_index < nums_length:
                diff = target - num
                inner_index = outer_index + 1
                for nextNum in nums[inner_index:]:  # slice next part of array
                    if nextNum == diff:
                        ret.extend([outer_index, inner_index])
                        # return [outer_index, inner_index]
                        return ret  # break out of inner loop
                    inner_index += 1

            outer_index += 1

        return ret

    @staticmethod
    def optimized(nums: List[int], target: int) -> List[int]:
        dict_nums = {}
        ret = []
        for index, num in enumerate(nums):
            diff = target - num

            if diff in dict_nums:
                ret.extend([index, dict_nums[diff]])
                break
            dict_nums[num] = index

        return ret