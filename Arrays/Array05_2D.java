import java.util.Arrays;

public class Array05_2D {
    public static void main(String[] args) {
        // step 1 - declare 
        int[][] int2DArr; // --> O(1) time 

        // step 2 - instantiate
        int2DArr = new int[2][2];  // --> This has made 4 cell in 1d inside memory // --> O(1) time 

        // Overall time complexity is O(m*n)  --> where m is row and n is column, as we are going thru each row and column cell to initailze values.
        // step 3 - initialize 
        int2DArr[0][0] = 1; // --> O(1) time 
        int2DArr[0][1] = 2; // --> O(1) time 
        int2DArr[1][0] = 3; // --> O(1) time 
        int2DArr[1][1] = 4; // --> O(1) time 

        System.out.println(Arrays.deepToString(int2DArr));

        // All together :
        String[][] s2dArr = {{"a","b"},{"c","d"}};  // --> O(1) time complexity, advisable to do this way
        System.out.println(Arrays.deepToString(s2dArr));

        // Space complexity is O(m*n) as we are allocating m * n number of cells 

    


    }
    
}
