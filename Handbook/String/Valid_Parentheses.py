s = "()[]{}"

stack = []
op = {')':'(',']':'[','}':'{'}

for i in s:
    if i in op:
        if stack and stack[-1] == op[i]:
            stack.pop()
        else:
            print(False)
    else:
        stack.append(i)

print (True if not stack else False)
