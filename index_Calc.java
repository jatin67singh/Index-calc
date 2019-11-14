import java.util.*;
public class indexCalc {

	int arr[];
	int sum=0;
	indexCalc(int arr[], int size, int num)
	{
		this.arr=arr;
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				sum=sum+arr[j];
				if(sum==num)
				{
					System.out.println("Starting index: "+i+"ending index: "+j);
					break;
				}
			}
			sum=0;
		}

	}
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		indexCalc obj=new indexCalc(arr, size, num);

	}

}
