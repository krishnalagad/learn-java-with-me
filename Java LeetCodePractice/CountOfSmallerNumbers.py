from typing import List
from sortedcontainers import SortedList

class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:

        nums_sorted = SortedList(nums)
        ans = []

        for n in nums:
            idx = nums_sorted.bisect_left(n)
            ans.append(idx)
            nums_sorted.remove(n)

        return ans