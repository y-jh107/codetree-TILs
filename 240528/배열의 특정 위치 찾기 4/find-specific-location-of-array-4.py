nums = list(map(int, input().split()))

even_sum = 0 
cnt_even = 0

for i in range(10):
    if nums[i] == 0:
        break
    
    if nums[i] % 2 == 0:
        even_sum += nums[i]
        cnt_even += 1

print(f"{cnt_even} {even_sum}")