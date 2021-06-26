nums = [12,345,2,6,7896]

count = 0
for i in nums:
    a = len(str(i))
    if(a % 2  == 0):
        count+=1

print(count)
