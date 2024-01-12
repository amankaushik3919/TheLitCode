class Solution:
    def countBits(self, n: int) -> list[int]:
        self.n=n
        self.li = []
        for i in range(self.n+1):
            a = str(bin(i))
            count = 0
            for i in a:
                if i == '1':
                    count+=1
            self.li.append(count)
        return self.li
