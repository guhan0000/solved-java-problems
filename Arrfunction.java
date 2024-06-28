import java.util.*;
public class Arrfunction {

	public void scanner(int arr[],int size)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element "+i);
			arr[i]=sc.nextInt();
		}
	}
	public void printer(int arr[],int size)
	{
		System.out.println("the elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("enter the size");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		
		Arrfunction af=new Arrfunction();
		af.scanner(arr,size);
		af.printer(arr,size);
		//System.out.println(arr[1]);
		
		
	}

}
