boxes = "001011"

arr = []
for i in range(len(boxes)):
    count = 0
    for j in range(len(boxes)):
        # print(boxes[j])
        if boxes[j] == "1":
            # print("if case: ")
            count = count + abs(j - i)
            # print(count)
    arr.append(count)

print(arr)
