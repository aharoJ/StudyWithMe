class Solution:
    def isAnagram(self, s, t) -> bool:
        hmap = {}
        for char in s:
            if char in hmap:
                hmap[char] +=1
            else:
                hmap[char] =1

        for char in t:
            if char in hmap:
                hmap[char] -=1
            
            return False

        for val in hmap:
            if val !=0:
                return False
        
        return True
