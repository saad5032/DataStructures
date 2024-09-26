
import java.util.Arrays;

public class Array02_insertion{

    int arr[] = null;

    // This method is to create and initailze 1d array of given size
    public void OneDArray(int SizeOfArray){
        arr = new int[SizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;  // Here all values of array are now -214783648 in array.
            }
        }
    
    public void insert(int AtGivenIndex, int valueToBeInserted){
        try {
            if(arr[AtGivenIndex] == Integer.MIN_VALUE){  // if element is 0, it means no other element has been inserted, so insert.
                arr[AtGivenIndex] = valueToBeInserted;
                // System.out.println("Succcessfully inserted");
            }else{
                System.out.println("The cell in array is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    
    }

    public static void main(String[] args) {
        Array02_insertion obj = new Array02_insertion();
        obj.OneDArray(5);
        obj.insert(0,10);
        obj.insert(2, 15);
        obj.insert(3, 20);
        obj.insert(25, 30);
        System.out.println(Arrays.toString(obj.arr));
    }

    

}