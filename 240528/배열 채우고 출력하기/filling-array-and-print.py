arr = list(map(str, input().split()))

reversed_arr = arr[::-1]

for i in range(len(reversed_arr)):
    print(reversed_arr[i], end = "")