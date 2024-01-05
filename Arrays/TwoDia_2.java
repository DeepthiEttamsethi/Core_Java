package Arrays;

public class TwoDia_2 {

	public static void main(String[] args) {
//		int [][] arr = {{1,2},{3,4},{5,6}};
//		int size =0;
//		for(int i= 0;i<arr.length;i++) {
//			size+=arr[i].length;		
//		}
//		System.out.println(size);
		
		
//		int [][] arr = {{1,2},{3,4},{5,6}};
//		int size =0;
//		for(int i=0;i<arr.length;i++) {
//		for(int j= 0;j<arr.length;j++) {
//			System.out.println(arr[i][j]+" ");			
//		}
//		System.out.println(size);
//		}
		int [][] arr = {{1,2},{3,4},{5,6}};
		int size =0;
		for(int i=0;i<arr.length;i++) {
		for(int j= 0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+" ");			
		}
		System.out.println();
		}
	
	}
}