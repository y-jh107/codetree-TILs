import sys

n = int(input())
arr = list(map(int, input().split()))

max_value = max(arr)
max_index = arr.index(max_value)

print(max_index + 1, end = ' ')

while True:
    if max_index == 0:
        break

    max_value = -sys.maxsize
    for i in range(max_index):
        if arr[i] > max_value:
            max_value = arr[i]
    
    max_index = arr.index(max_value)
    print(max_index + 1, end = ' ')