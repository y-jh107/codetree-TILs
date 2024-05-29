arr = list(map(str, input().split()))

for i in range(10):
    if i % 3 == 1:
        print(arr[i], end = " ")