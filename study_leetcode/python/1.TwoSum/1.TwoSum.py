class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap = {}
        for i , v in enumerate(nums):
            remaining_num = target - v

            if remaining_num in hmap:
                return hmap[remaining_num, i]
            else:
                hmap[v] = i
            
