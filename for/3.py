a = int(input())
b=0

def sum(c):
		global b
		if c == 0:
			return
		b += c
		sum(c-1)
			
sum(a)
print(b)
		