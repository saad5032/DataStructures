import java.util.Arrays;
public class Array06_2DArray {
    int  arr[][] = null;

    // This is constructor of this class using it you can create a 2D Array
    // Space coomplexity is O(m*n) as m and n can be different we cannot assume both to be same and is quadratic like n^2
    // Time Complexity is O(m*n)
    public Array06_2DArray(int rows, int col){
        this.arr = new int[rows][col];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col ; j++){
                this.arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in 2d Array 
    // Overall time complexity of method is O(1)
    // Overall space complexity of method is O(1) as no new memory is required
    public void insert(int row, int col, int value){
        try {
            // means array cell is not occupied
            if (arr[row][col] == Integer.MIN_VALUE){  // Time - O(1)
                arr[row][col] = value; // Time - O(1)
            }else{
                System.out.println("This cell is already occupied"); // Time - O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index out of Bounds"); // Time - O(1)
        }
    }

    public void accessCell(int row, int col){
        try {
            System.out.println("The cell in the given array is : " + this.arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Array06_2DArray obj = new Array06_2DArray(2, 2);
        obj.insert(0, 0, 100);
        obj.insert(1, 0, 200);
        System.out.println(Arrays.deepToString(obj.arr));
        obj.accessCell(0, 0);
    }
}


