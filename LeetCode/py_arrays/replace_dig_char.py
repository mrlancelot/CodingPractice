replace = "abcdefghijklmnopqrstuvwxyz"
s = "a1b2c3d4e"

res = ""
for i in range(len(s)):
    if replace.find(s[i]) == -1:
        ind = replace.find(s[i-1])
        res = res + replace[ind + int(s[i])]
    else:
        res = res + s[i]
        
print(res)
