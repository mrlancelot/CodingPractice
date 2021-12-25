s = "A man, a plan, a canal: Panama"

l,r = 0, len(s) - 1

while l < r:
    while l < r and not isAlpha(s[l]):
        l += 1
    while r > l and not isAlpha(s[r]):
        r -= 1
    
    if s[l].lower() != s[r].lower():
        print(False)
    l += 1
    r += 1
print(True)
def isAlpha(self, c):
    return (ord('A') <= ord(c) <= ord('Z') or ord('a') <= ord(c) <= ord('z') or ord('0') <= ord(c) <= ord('9'))
    