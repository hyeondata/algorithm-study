a,b = map(int,input().split())
if a==0 and b<45:
		print(a+23,b+15)
elif b<45:
	print(a-1,b+15 )	
else :
	print(a,b-45)