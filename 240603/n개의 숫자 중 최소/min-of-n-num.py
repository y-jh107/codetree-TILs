import sys

n = tuple(map(int, input()))

arr = list(map(int, input().split()))

min_value = min(arr)
cnt = 0
for elem in arr:
    if elem == min_value:
        cnt += 1

print(min_value, cnt)