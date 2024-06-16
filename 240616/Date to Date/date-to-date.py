m1, d1, m2, d2 = tuple(map(int, input().split()))

dates_of_month = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

elapsed_days = 1

while True:
    if m1 == m2 and d1 == d2:
        break
    
    elapsed_days += 1
    d1 += 1

    if d1 > dates_of_month[m1]:
        m1 += 1
        d1 = 1

print(elapsed_days)