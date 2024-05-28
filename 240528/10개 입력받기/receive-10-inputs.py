nums = list(map(int, input().split()))
num_sum = 0
cnt = 0

for i in range(10):
    if nums[i] == 0:
        break
    num_sum += nums[i]
    cnt += 1

num_avg = num_sum / cnt

print(f"{num_sum} {num_avg:.1f}")