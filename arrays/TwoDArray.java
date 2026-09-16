package arrays;

public class TwoDArray {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    // System.out.println(matrix[0][2]);
    for (int index = 0; index < matrix.length; index++) {
      for (int col = 0; col < matrix.length; col++) {
        System.out.print(matrix[index][col] + " ");
      }
      System.out.println();

    }

    // Sum of Two D Array

    int[][] arr = { { 1, 2, 3 }, { 5, 10, 21 } };
    int Sumof2DArray = arr[0][0];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] > Sumof2DArray) {
          // Update sum
          Sumof2DArray = arr[i][j];
        }
      }
    }
    System.out.println(Sumof2DArray);
  }
}