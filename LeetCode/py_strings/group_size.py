groupSizes = [2,1,3,3,3,2]


gs = list(set(groupSizes))
fin = []
for j in range(len(gs)):
    gp = []
    for i in range(len(groupSizes)):
        if (gs[j] == groupSizes[i]):
            gp.append(i)
            if len(gp) == gs[j]:
                fin.append(gp)
                gp = []

print(fin)