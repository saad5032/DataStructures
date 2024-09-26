package LeetcodeArray;

import java.util.Arrays;

/*
This program can get you first 2 highest
 Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
 */
public class array03 {
    public static int[] BestScore(int[] array){
    int firstHighest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;

    for (int ele : array){
        if(ele>firstHighest){
            secondHighest = firstHighest;
            firstHighest = ele;
        }else if (ele < firstHighest && ele > secondHighest){
            secondHighest = ele;
        }
    }
    return new int[] {firstHighest, secondHighest};
    }

    public static void main(String[] args) {
        int myArray[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(BestScore(myArray)));

    }
}
