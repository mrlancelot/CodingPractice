word1 = ["a", "cb"]
word2 = ["ab", "c"]

w1 = ""
w2 = ""

for i in word1:
    w1=w1+i
for i in word2:
    w2=w2+i
print(w1,w2)
if w1 == w2:
    print("true")
else:
    print("false")



# return "".join(word1)=="".join(word2)