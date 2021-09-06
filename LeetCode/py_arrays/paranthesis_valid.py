s = "()))(("

c1 = 0
c2 = 0

for i in range(len(s)):
    if s[i] == '(':
        c1 = c1 + 1
    elif s[i] == ')' and c1 != 0:
        c1 = c1 - 1
    elif s[i] == ')' and c1 == 0:
        c2 = c2 + 1


print(c1 + c2)