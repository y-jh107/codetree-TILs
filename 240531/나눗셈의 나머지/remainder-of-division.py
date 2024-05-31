a_and_b = list(map(int, input().split()))
mod = [0 for _ in range(10)]
a = a_and_b[0]
b = a_and_b[1]

while True:
    remain = a % b
    a = a // b
    mod[remain] += 1

    if a <= 1:
        break

ans = 0
for i in range(10):
    ans += mod[i] ** 2

print(ans)