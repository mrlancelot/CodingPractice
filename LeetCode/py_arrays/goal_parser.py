command = "(al)G(al)()()G"

res = ""
for i in range(len(command)) :
    if command[i] == 'G':
        res=res+"G"
    elif command[i] == '(' and command[i+1] == ')':
        res=res+"o"
    elif command[i] == '(' and command[i+1] == 'a':
        res=res+"al"

print(res)