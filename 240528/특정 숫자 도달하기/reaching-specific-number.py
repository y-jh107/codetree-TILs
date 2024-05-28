nums = list(map(int, input().split()))

sum = 0
for i in range(10):
    if nums[i] >= 250:
        print("%d %.1f" %(sum, sum / (i)))
        break

    sum += nums[i]