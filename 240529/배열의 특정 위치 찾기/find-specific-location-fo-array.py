arr = list(map(int, input().split()))

even_sum = 0
third_sum = 0
cnt = 0
#print(len(arr))
for i in range(10):
    #print(i)
    if i % 2 == 1:
        even_sum += arr[i]
    if i % 3 == 2:
        third_sum += arr[i]
        cnt += 1

third_avg = third_sum / cnt

print(f"{even_sum} {third_avg:.1f}")