nums = [3,2,3]
target = 6

seen = {}

for i, n in enumerate(nums):
    if target - n in seen:
        print(seen[target-n],i)
    elif n not in seen:
        seen[n] = i
