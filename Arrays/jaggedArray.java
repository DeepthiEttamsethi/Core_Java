package Arrays;

public class jaggedArray {

    public static void main(String[] args) {
//        int[][] arr = new int[3][];
//        arr[0] = new int[2];
//        arr[1] = new int[6]; // Changed the size from 5 to 6 to match the number of elements assigned.
//        arr[2] = new int[3];
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//
//        arr[1][0] = 25;
//        arr[1][1] = 48;
//        arr[1][2] = 85;
//        arr[1][3] = 81;
//        arr[1][4] = 96;
//        arr[1][5] = 42;
//
//        arr[2][0] = 1;
//        arr[2][1] = 2;
//        arr[2][2] = 1;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " "); // Fixed the print statement
//            }
//            System.out.println();
//        }
        
        int[][] arr = {
                {1, 2},
                {3, 4},
                {5, 6}
            };

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }