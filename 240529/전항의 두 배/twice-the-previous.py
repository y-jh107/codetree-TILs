fibo = list(map(int, input().split()))

for i in range(2, 10):
    fibo_sum = 2 * fibo[i - 2] + fibo[i - 1]
    fibo.append(fibo_sum)
    
for i in fibo:
    print(i, end = ' ')