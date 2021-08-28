accounts = [[2,8,7],[7,1,3],[1,9,5]]
fin = 0
sum = 0

for i in accounts:
    for j in i:
        sum +=j
    if sum > fin:
        fin = sum
        sum = 0
    else:
        sum = 0

print (fin)
