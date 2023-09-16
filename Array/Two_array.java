package Array;

public class Two_array {

	public static void main(String[] args) {
		
	int[][] twoarray = {{10,20,34},{23,45}, {23,56,78,34,45,67}}; // 3 rows, 2,3,4 columns
				
				
	System.out.println("no. of rows "+ twoarray.length);
				
	for(int i=0;i<twoarray.length;i++)
	System.out.println("no. of columns in  "+ i+ " row :"+ twoarray[i].length);
				
	System.out.println();
	for(int i= 0;i<twoarray.length;i++)
	{
		for(int j=0;j<twoarray[i].length;j++)
		System.out.print(twoarray[i][j]+"  ");
		System.out.println();
	}
			
		
  }

}