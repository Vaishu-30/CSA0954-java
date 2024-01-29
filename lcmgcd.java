class lcmgcd
{
public static void main(String[] args)
{
int num[]={4,8};
int gcd=num[0];
int lcm=num[0];
for(int i=0;i<num.length;i++)
{
int current=num[i];
while(current!=0)
{
int temp=current;
current=gcd%current;
gcd=temp;
}
lcm=(lcm*num[i])/gcd;
}
System.out.println(lcm);
System.out.println(gcd);
}
}

