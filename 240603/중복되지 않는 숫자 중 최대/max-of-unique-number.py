n = int(input())

arr = list(map(int, input().split()))

max_value = -1
is_in = []

for i in range(n):
    if arr[i] in is_in:
        continue

    if arr[i] in arr[i + 1:]:
        is_in.append(arr[i])
        continue

    if  arr[i] > max_value:
        max_value = arr[i]

print(max_value)