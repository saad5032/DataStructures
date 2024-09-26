import java.util.Arrays;
public class Array01 {
    public static void main(String[] args) {
        int[] arr; // 1. declaring array 
        arr = new int[5];  // 2. Instanstiate - the declared arr refers or now points to array of size 5
        arr[0] = 1; // 3. Initalizing the values of array via arr reference
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // Altogether 
        String sArray[] = {"a", "b"};
        // sArray[2] = "b";  --> this will throw error as size is 2 and cannot be modified.
        System.out.println(Arrays.toString(sArray));
    }
}
