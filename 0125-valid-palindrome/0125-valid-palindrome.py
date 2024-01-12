class Solution(object):
    def isPalindrome(self, s):
        s1=""
        for i in s:
            if i.isalnum():
                s1+=i
        k=s1.lower()
        if k[::-1]==k:
            return True
        else:
            return False
