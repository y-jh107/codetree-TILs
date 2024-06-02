n = tuple(map(int, input().split()))

arr = list(map(int, input().split()))

cnt_2 = 0

for i in range(n[0]):
    if arr[i] == 2:
        cnt_2 += 1
    
    if cnt_2 == 3:
        print(i + 1)
        break