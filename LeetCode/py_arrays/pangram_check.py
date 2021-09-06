pangram = "abcdefghijklmnopqrstuvwxyz"
sentence = "leetcode"

wc = 0
for i in range(len(pangram)):
    if sentence.find(pangram[i]) !=  -1:
        wc = wc + 1

if wc == 26:
    print (True)
else:
    print (False)