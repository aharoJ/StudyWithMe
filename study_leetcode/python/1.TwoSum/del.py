class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap = {}
        for i, val in enumerate(nums):
            remaining_num = target - val
            if remaining_num in hmap:
                return [ hmap[remaining_num], i ]
            else:
                hmap[val] = i