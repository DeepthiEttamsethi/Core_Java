package Arrays;

public class Single_Dia_1 {
	public static void main(String[] args) {
		
		//int i;
		int [] j = new int [5];
		j[0] = 5;
		j[2] = 8;
		j[4] = 45;
		
		j[2] = 34;
		j[2] = 85;
		
//		System.out.println(j[2]);
//		System.out.println(j[4]);
		
//		for(int i=0;i<j.length;i++) {
//			System.out.println(j[i]);
//		}
		
//		int sum = j[0] + j[1] + j[2] + j[3] + j[4];
//		System.out.println(sum);
		
		int i = 0;
		while(i<j.length) {
			System.out.println(j[i]);
			i++;
		}
	}
}