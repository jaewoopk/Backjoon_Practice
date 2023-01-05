import sys

n = int(sys.stdin.readline().strip())

dict = {}

content = list(map(int,sys.stdin.readline().split()))

for i in range(n) :
    if content[i] in dict :
        dict[content[i]] += 1
    else :
        dict[content[i]] = 1

m = int(sys.stdin.readline().strip())

arr2 = list(map(int,sys.stdin.readline().split()))

for i in range(m) :
    if arr2[i] not in dict :
        print("%d "%0,end="")
    else :
        print("%d "%dict[arr2[i]],end="")
