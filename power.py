num=input("Number: ")
n=1
val=1
while val<num:
	val=2**n
	if(val==num):
		print 'True'
		break
	n=n+1
if(val!=num):
	print 'False'
