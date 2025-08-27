class Solution:
    def numOfSubarrays(self, arr):
		mod=10**9+7
		s,a,res=0,[1,0],0
		for x in arr:
			s+=x
			res=(res+a[(s%2)^1])%mod
			a[s%2]+=1
		return res
