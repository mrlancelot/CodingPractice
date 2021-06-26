x = 0
temp = 0
nums = [1, 0, 1, 1, 0, 1]
for i in nums:
    if i  == 1:
        temp+=1
    elif i == 0:
        temp = 0
    if(temp > x):
        x = temp
print(x)
