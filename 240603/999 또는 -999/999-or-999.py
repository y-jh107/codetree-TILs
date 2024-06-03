import sys

arr = list(map(int, input().split()))

max_value = -sys.maxsize
min_value = sys.maxsize

for elem in arr:
    if elem == 999 or elem == -999:
        break
    if elem > max_value:
        max_value = elem
    if elem < min_value:
        min_value = elem

print(max_value, min_value)