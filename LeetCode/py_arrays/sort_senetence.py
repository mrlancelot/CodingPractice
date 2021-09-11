s = "is2 sentence4 This1 a3"

st = s.split(" ")

res = [0] * len(st)

for i in st:
    ind = int(i[-1])-1
    val = i[0:-1]
    res[ind] = val

print(" ".join(res)[0:])