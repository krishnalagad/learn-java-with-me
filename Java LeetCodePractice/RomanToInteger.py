class Solution:
    def romanToInt(self, s: str) -> int:
        d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        n=0
        SumAplha =0 
        m = len(s)
        while n<=m-1:
            
            if n==m-1:
                SumAplha+=d[s[n]]
                n+=1
                
            elif (d[s[n]] < d[s[n+1]]):
                SumAplha+=(d[s[n+1]]-d[s[n]])
                n+=2
                
            else:
                SumAplha+=d[s[n]]                
                n+=1
                
        return SumAplha

print(romanToInt("X"))  