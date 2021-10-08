nums = [-2,1,-3,4,-1,2,1,-5,4]

sum = 0
num = 0

for i in nums:
    sum += i
    num = max(sum, num);
    if sum < 0:
        sum = 0

print(num)