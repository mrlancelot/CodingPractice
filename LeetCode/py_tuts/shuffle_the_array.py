nums = [2,5,1,3,4,7]
n = 3

ans = []
for i in range(n):
    ans.append(nums[i])
    ans.append(nums[n+i])

print(ans)