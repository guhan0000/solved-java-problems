
public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]=new int[3][3];
		arr1[0][0]=10;
		arr1[0][1]=20;
		arr1[0][2]=30;
		arr1[1][0]=40;
		arr1[1][1]=50;
		arr1[1][2]=60;
		arr1[2][0]=70;
		arr1[2][1]=80;
		arr1[2][2]=90;
		String arr2[][]={{"java","python"},{"c","php"}};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
