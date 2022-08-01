import sys

def BinarySearch(a, b, start, end, point) :
    while (start <= end) :
        mid = (start + end) // 2
        if (a[mid] == b[point]) :
            return 1
        elif (a[mid] < b[point]) :
            start = mid + 1
        else :
            end = mid - 1
    return 0

result = 0
a = []
b = []
c = []

n, m = map(int, input().split())

for i in range(n) :
    a.append(sys.stdin.readline().rstrip())

for i in range(m) :
    b.append(sys.stdin.readline().rstrip())

a.sort()
b.sort()

for i in range(m) :
    if (BinarySearch(a, b, 0, n - 1, i)) :
        c.append(b[i])
        result += 1

print(result)

for i in c :
    print(i)

