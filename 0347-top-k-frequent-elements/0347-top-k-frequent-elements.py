class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        count = {}

        for i in nums:
            if i not in count:
                count[i] = 0
            count[i] += 1
        
        res = sorted(count , key = count.get , reverse = True)
        return res[:k]