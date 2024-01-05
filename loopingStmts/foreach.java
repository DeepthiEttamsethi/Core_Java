package loopingStmts;

public class foreach {

	public static void main(String[] args) {
		int [][] arr = {
				{1,2,5},
				{4,8,9},
				{7,9,8}
		};
		
//		int sum=0;
//		for(int[]singleDimArray: arr) {
//			for(int value :singleDimArray) {
//				System.out.println(value);
//			}
//		System.out.println();
//		}	
		
        int sum = 0;
        int noOfElements = 0; // Corrected variable name
        for (int[] singleDimArray : arr) {
            for (int value : singleDimArray) {
                sum += value;
                noOfElements++; // Corrected variable name
                System.out.println(value);
            }
            System.out.println();
        }
    }
}