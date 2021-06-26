nums = [0,1,2,2,3,0,4,2]
val = 2
nums.sort()
arr = []
a = nums[0]
arr.append(a)
for i in nums:
    if( i != a):
        arr.append(i)
        a = i

print(arr)
