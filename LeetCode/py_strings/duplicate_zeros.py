arr = [1,0,2,3,0,4,5,0]
x  = len(arr)
arr1 = []
for i in arr:
    if(i == 0):
        arr1.append(i)
        arr1.append(i)
    else:
        arr1.append(i)

arr = arr1[0:x]

print(arr)