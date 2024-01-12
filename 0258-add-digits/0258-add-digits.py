class Solution:
    def addDigits(self, num: int) -> int:
        self.num=num
        if self.num == 0:
            return 0
        elif self.num % 9 == 0:
            return 9
        else:
            return self.num%9
