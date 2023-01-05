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

n, m = map(int, input().split())


result = 0

a = input().split()
b = input().split()

a.sort()
b.sort()

for i in range(m) :
    if (BinarySearch(a, b, 0, n - 1, i)) :
        result += 1

print(n + m - (result * 2))