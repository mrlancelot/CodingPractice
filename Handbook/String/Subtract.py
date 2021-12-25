n = 12
s,p = 0,1
for i in str(n):
    s += int(i)
    p *= int(i)

print(p - s)