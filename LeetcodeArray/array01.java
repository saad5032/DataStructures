package LeetcodeArray;

import java.util.Arrays;

/*
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]. 

 */
public class array01 {

    public static int[] middleArr(int[] arr){
        if(arr.length <= 2){
            return new int[0];
        }
        int MidArray[] = new int[arr.length-2];
        int index = 1;
        while(index < arr.length-1){
            MidArray[index-1] = arr[index];
            index++;
        }
        return MidArray;
        
    }
    public static void main(String[] args) {
        int myArray[] = {1,2,34,5};
        int mySecArray[] ={1};
        System.out.println(Arrays.toString(middleArr(myArray)));
        System.out.println(Arrays.toString(middleArr(mySecArray)));
    }
}
