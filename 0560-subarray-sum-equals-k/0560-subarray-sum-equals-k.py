class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = {0:1}
        curr = 0
        res = 0

        for i in nums:
            curr += i

            if curr - k in count:
                res += count[curr-k]
            count[curr] = count.get(curr ,0) + 1
        
        return res
            
