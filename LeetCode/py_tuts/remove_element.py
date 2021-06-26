nums = [0,1,2,2,3,0,4,2]
val = 2
a = len(nums)
count  = 0
for i in nums:
    if i!=val:
        count+=1

print(count)