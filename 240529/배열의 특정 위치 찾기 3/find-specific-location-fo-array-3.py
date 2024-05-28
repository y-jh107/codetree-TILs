arr = list(map(int, input().split()))

before_zero = 0

for i in range(len(arr)):
    if arr[i] == 0:
        before_zero += arr[i - 1]
        before_zero += arr[i - 2]
        before_zero += arr[i - 3]
        break

print(before_zero)