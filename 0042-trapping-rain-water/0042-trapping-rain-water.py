class Solution:
    def trap(self, height: list[int]) -> int:
        n = len(height)
        left =[0]*n
        right =[0]*n
        maxLen = -1

        for i in range(n):
            if height[i] >= maxLen:
                maxLen = height[i]
            left[i] = maxLen
        
        maxLen = -1

        for i in range(n-1 , -1 , -1):
            if height[i] >= maxLen:
                maxLen = height[i]
            right[i] = maxLen
        
        total = 0
        for i in range(n):
            total += min(left[i] , right[i]) - height[i]
        return total