n_and_q = list(map(int, input().split()))

n = n_and_q[0]
q = n_and_q[1]

_list = list(map(int, input().split()))

for i in range(q):
    question = list(map(int, input().split()))
    if question[0] == 1:
        print(_list[question[1] - 1])
    elif question[0] == 2:
        index = 0
        if question[1] in _list:
            index = _list.index(question[1]) + 1
        print(index)
    elif question[0] == 3:
        for j in range(question[1] - 1, question[2]):
            print(_list[j], end = ' ')
        print()