class Spy:
    def __init__(self, code, loc, time):
        self.code = code
        self.loc = loc
        self.time = time

    def __repr__(self):
        return f"secret code : {self.code}\nmeeting point : {self.loc}\ntime : {self.time}"

spy1 = input()
spy1 = spy1.split()

spy = Spy(spy1[0], spy1[1], spy1[2])

print(spy)