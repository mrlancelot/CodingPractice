s = "aiohn"
indices = [3,1,4,2,0]

fin = [None]*len(indices)
for i in range(len(s)):
    fin[indices[i]] = s[i]

print(''.join(fin))