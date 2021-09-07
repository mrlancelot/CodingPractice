nums = [3,3]
target = 6
count = 0
for i in range(len(nums)):
    for j in range(len(nums)):
        if (nums[i] + nums[j]) == target and i != j :
            print(i,j)
            count = 1
    if count == 1:
        break