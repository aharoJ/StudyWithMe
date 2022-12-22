class Solution:
    def isAnagram(self,l, r):
        hmap = {}
        for c in l:
            if c in hmap:
                hmap[c] +=1
            else:
                hmap[c] =1
        
        for c in r:
            if c in hmap:
                hmap[c] -=1
            else:
                return False
        
        for val in hmap.values():
            if val != 0:
                return False
            else:
                return True
        
        return True