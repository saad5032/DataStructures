package LeetcodeArray;
/*
 2D Arrays
Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {
{1,2,3},
{4,5,6},
{7,8,9}};
sumDiagonalElements(myArray2D) # 15

 */
public class array02 {
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i=0 ; i <array.length; i++){
              sum += array[i][i];
              System.out.println(array[i][i]);
        }
        return sum;
  }

  public static void main(String[] args) {
    int myArray2D[][] = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(sumDiagonalElements(myArray2D));
  }

}
