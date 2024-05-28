arr = list(map(int, input().split()))

even_sum = 0
third_sum = 0
cnt = 0

for i in range(len(arr)):
    if i % 2 == 1:
        even_sum += arr[i]
    elif i % 3 == 2:
        third_sum += arr[i]
        cnt += 1

third_avg = third_sum / cnt

print(f"{even_sum} {third_avg:.1f}")