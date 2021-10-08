intervals = [[1,4],[0,2],[3,5]]

intervals.sort()
tmp = []
res = []
for i in range(len(intervals)):
    print(i,len(intervals))
    if (i != len(intervals)-1) and (intervals[i][0] <= intervals[i+1][0]) and  (intervals[i][1] >= intervals[i+1][0]):
            tmp = [min(intervals[i+1][0],intervals[i][0]),max(intervals[i+1][1],intervals[i][1])]
    elif i == (len(intervals)-1):
        if len(tmp) > 0:
            res.append(tmp)
            tmp = []
        else:
            res.append(intervals[i])
    else:
        if len(tmp) > 0:
            res.append(tmp)
            tmp = []
        else:
            res.append(intervals[i])
print(res)

