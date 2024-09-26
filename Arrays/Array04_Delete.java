import java.util.Arrays;

public class Array04_Delete {
    // We cannot delete an element from array and keep it blank, so
    // we delete element and put another value like -2^31 in place which is Integer Min value

    int arr[] = {1,2,3,4,5};

    // --> Overall time complexity is O(1) 
    // --> Overall space complexity is O(1) as no new space in stack is used.
    public void deleteElement(int IndexValueToBeDeleted){
        try {
            arr[IndexValueToBeDeleted] = Integer.MIN_VALUE;  // --> O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have provided is out of Bound");  // --> O(1)
        }
   
    }

    public static void main(String[] args) {
        Array04_Delete obj = new Array04_Delete();

        // I want to delete element 3 at index 2 in array, so it will be replaced with integer min value -2^32
        obj.deleteElement(2);
        System.out.println(Arrays.toString(obj.arr));
    }
}
