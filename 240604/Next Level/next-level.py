class User:
    def __init__(self, name, level):
        self.name = name
        self.level = level

    def __repr__(self):
        return f"user {self.name} lv {self.level}"

user1 = User('codetree', 10)
user_name, lev = tuple(input().split())

user2 = User(user_name, lev)

print(user1)
print(user2)