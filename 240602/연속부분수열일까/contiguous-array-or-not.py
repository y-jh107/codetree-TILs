arr_lens = list(map(int, input().split()))

a_len = arr_lens[0]
b_len = arr_lens[1]

a_arr = list(map(int, input().split()))
b_arr = list(map(int, input().split()))

is_true = False
for i in range(a_len - b_len + 1):
    new_arr = [num for num in a_arr[i:i + b_len]]
    if new_arr == b_arr:
        is_true = True

if is_true:
    print('Yes')
else:
    print('No')