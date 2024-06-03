n = int(input())
arr = list(map(int, input().split()))

max_value = max(arr)
max_index = arr.index(max_value)

print(max_index + 1, end = ' ')

while max_index != 0:
    max_value = 0

    for i in range(max_index):
        if arr[i] > max_value:
            max_value = arr[i]
        
        max_index = arr.index(max_value)
        print(max_index + 1, end = ' ')

        if max_index == 0:
            break