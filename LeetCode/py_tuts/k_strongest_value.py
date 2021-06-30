arr = [1,2,3,4,5]
k = 2

arr.sort()
p = 0 
if(len(arr)%2!=0):
    p = len(arr)/2
else:
    p = (len(arr) - 1) /2
res = []
m = arr[int(p)]
val = 0
print(p,m)
for i in arr:
    val = abs( m - i)
    # print([val,i])
    res.append([val,i])
res.sort(reverse=True)
print(res)
fin = []
c = 0 
for i in res:
    for j in i:
        # print(j,c)
        if(c%2!=0):
            fin.append(j)
        c+=1

print(fin[0:k])
# print(fin)