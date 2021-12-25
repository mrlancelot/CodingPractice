s = "rat"
t = "car"
if len(s) != len(t):
    print(False) 
        
wc_s,wc_t = {},{}

for i in range(len(s)):
    if s[i] in wc_s: wc_s[s[i]] += 1
    else: wc_s[s[i]] = 1
    if t[i] in wc_t: wc_t[t[i]] += 1
    else: wc_t[t[i]] = 1

if wc_t == wc_s:
    print(True)
else:
    print(False)