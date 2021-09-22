nums = [2,0,2,1,1,0]

arr = [0,0,0]
for i in nums:
    if i == 0:
        arr[0] = arr[0] + 1
    elif i == 1:
        arr[1] = arr[1] + 1 
    elif i == 2:
        arr[2] = arr[2] + 1
res = []
for i in range(len(arr)):
    tmp = [i] * arr[i]
    res.extend(tmp)
print(res)