package loopingStmts;

public class forEachLoop {
	public static void main(String[] args) {
		
		int[]arr = {1,2,7,8,2,3,4,1};
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
		
//		for(int value : arr) {
//			System.out.println(value);
		

        int sum = 0;
        for (int value : arr) {
            sum += value;  // Remove the space between + and =
        }
//        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum/arr.length);
    }
}