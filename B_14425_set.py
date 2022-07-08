import sys

def BinarySearch(arr, check, start, end, point) :
    while (start <= end) :
        mid = (start + end) // 2
        if (arr[mid] == check[point]) :
            return 1
        elif (arr[mid] < check[point]) :
            start = mid + 1
        else :
            end = mid - 1
    return 0

n, m = map(int, sys.stdin.readline().split())

arr = []
check = []

count = 0

for i in range(n) :
    arr.append(input())

for i in range(m) :
    check.append(input())

arr.sort()

for i in range(m) :
    count += BinarySearch(arr,check,0,n - 1,i)

print(count)