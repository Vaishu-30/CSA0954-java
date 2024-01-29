class revstring
{
public static void main(String[] args)
{
String name="vaishu";
String empty="";
int len=name.length();
for(int i=len-1;i>=0;i--)
{
empty=empty+name.charAt(i);
}
System.out.println(empty);
}
}
