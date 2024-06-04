class Agent:
    def __init__(self, name, score: int):
        self.name = name
        self.score = score
    
    def __repr__(self):
        return f"{self.name} {self.score}"

def find_min(_list: list):
    min_value = 101
    min_index = 0

    for i in range(5):
        if _list[i].score < min_value:
            min_value = _list[i].score
            min_index = i

    return min_index


agents = []

for _ in range(5):
    name, score = tuple(input().split())
    agents.append(Agent(name, int(score)))

index = find_min(agents)
print(agents[index])