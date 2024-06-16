def is_369(n):
    while n > 0:
        if n % 10 == 3 or n % 10 == 6 or n % 10 == 9:
            return True
        n = n // 10

def play_369(n):
    if n % 3 == 0 or is_369(n):
        return True

a, b = tuple(map(int, input().split()))

cnt = 0
for i in range(a, b + 1):
    if play_369(i):
        cnt += 1

print(cnt)