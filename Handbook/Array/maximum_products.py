nums = [3,-1,4]
res = max(nums)
curmin, curmax= 1,1
for i in nums:
    if i == 0:
        curmin, curmax= 1,1
        continue
    tmp = curmax * i
    curmax = max(curmax * i, i * curmin, i)
    curmin = min(tmp, i * curmin, i)
    res = max(res,curmax)
print(res)