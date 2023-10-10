public class MultiDimensionalArray13_1{
    public static void main(String[] args) {
        // 2D array
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // accessing elements of 2D array
        System.out.println("Element at (1, 2) in arr2D: " + arr2D[1][2]);
        
        // iterating through a 2D array
        System.out.println("Iterating through arr2D:");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        
        
        }
    }

