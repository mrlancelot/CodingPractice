import math

points = [[1,1],[2,2],[3,3],[4,4],[5,5]]
queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]

counts = []
for x in queries:
    count = 0
    for y in points:
        X = y[0] - x[0]
        Y = y[1] - x[1]   
        a = math.sqrt(X**2+Y**2)
        if a < x[2] or a == x[2]:
            count = count+1
        # print(a)
    counts.append(count)

print(counts)


