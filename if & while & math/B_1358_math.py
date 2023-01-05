import math

count = 0

w, h, x, y ,p = map(int, input().split())

r = h / 2

arr = [list(map(int, input().split())) for _ in range(p)]

for i in range(len(arr)) :
    if (arr[i][0] >= x and arr[i][0] <= x + w \
        and arr[i][1] >= y and arr[i][1] <= y + h) :
        count += 1
    elif (math.sqrt((x - arr[i][0])**2 + ((y + r) - arr[i][1])**2) <= r) :
        count += 1
    elif (math.sqrt((x + w - arr[i][0])**2 + ((y + r) - arr[i][1])**2) <= r) :
        count += 1

print(count)