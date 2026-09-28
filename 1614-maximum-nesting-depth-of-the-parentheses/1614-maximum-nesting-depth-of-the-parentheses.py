class Solution:
    def maxDepth(self, s: str) -> int:
        dept = 0
        r = 0
        for i in s:
            if i == ')':
                dept -=1
                continue
            
            if i != '(':
                continue
            dept += 1

            if dept > r:
                r = dept
        
        return r
