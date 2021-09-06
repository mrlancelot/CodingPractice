s = "Hello how are you Contestant"
k = 4

st = s.split(" ")
print(st)
res = ""
for i in range(k):
    res = res + st[i] + " "

print(res.strip(" "))
