class Solution:
    def numOfSubarrays(self, arr: List[int]) -> int:
		n = len(arr)
		odd = [0]*(n+1)
		even = [0]*(n+1)
		mod = int(1e9+7)
		for i in range(n):
			if arr[i]%2:
				odd[i+1] += even[i]+1
				odd[i+1] %= mod
				even[i+1] += odd[i]
				even[i+1] %= mod
			else:
				odd[i+1] += odd[i]
				odd[i+1] %= mod
				even[i+1] += even[i]+1
				even[i+1] %= mod

		return sum(odd)%mod