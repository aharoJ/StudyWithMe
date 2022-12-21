class Solution:
    def isAnagram(self, s, t) -> bool:
        if len(s) != len(t):
            return false

        return sorted(s) == sorted(t)