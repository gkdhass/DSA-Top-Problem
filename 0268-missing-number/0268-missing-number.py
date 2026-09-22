class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)

        for i in range(len(nums)):
            n ^= i
            n ^= nums[i]
        return n