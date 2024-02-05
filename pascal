import java.util.*;
class Pascal {

	public static void main(String[] args) {
		int i,j,a,n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows= ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			a=1;
			for(s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a*(i-j)/j;
			}
			System.out.println();
		}
	}

}
