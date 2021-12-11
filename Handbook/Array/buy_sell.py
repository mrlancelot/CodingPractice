prices = [7,6,4,3,1]
l, r = 0,1
maxP = 0

while r < len(prices):
    if prices[l] < prices[r]:
        newM = prices[r] - prices[l]
        maxP = max(maxP, newM)
    else:
        l = r
    r += 1

print(maxP)