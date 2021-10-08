arr = [4, 3, 6, 2, 1, 1]

lst = [0] * len(arr)
for i in arr:
    lst[i-1] += 1

for i in range(len(lst)):
    if lst[i] == 0:
        print("missing : ",str(i+1))
    elif lst[i] ==2:
        print("repeating : ",str(i+1))