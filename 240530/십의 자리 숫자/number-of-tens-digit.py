arr = list(map(int, input().split()))
cnt_arr = [0 for _ in range(9)]

for elem in arr:
    if elem == 0:
        break
    if elem >= 10:
        cnt_arr[elem // 10 - 1] += 1

for i in range(9):
    print(f"{i + 1} - {cnt_arr[i]}")