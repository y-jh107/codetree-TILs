import sys

n = int(input())

arr = list(map(int, input().split()))

max_value = -sys.maxsize
is_true = 0

for i in arr:
    if is_true != i and i > max_value:
        max_value = i
        is_true = i

print(max_value)