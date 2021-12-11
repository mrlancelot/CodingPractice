nums = [-2,1,-3,4,-1,2,1,-5,4]
maxSub = nums[0]
curSum = 0
for i in nums:
    if curSum < 0:
        curSum = 0
    curSum += i
    maxSub = max(curSum, maxSub)

print(maxSub)