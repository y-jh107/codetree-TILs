n_and_m = list(map(int, input().split()))

n = n_and_m[0]
m = n_and_m[1]

nums = list(map(int, input().split()))

cnt = nums.count(m)

print(cnt)