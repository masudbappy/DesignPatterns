package com.bappy.searchingAlgo;

public class BinarySearch {
    public static int search(int array[], int x){
        int low = 0;
        int high = array.length-1;
        while (low <=high){
            int mid = low+high/2;
            if (array[mid]==x){
                return mid;
            }
            if (array[mid]<x){
                low = mid+1;
            }else {
                high = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        int result = BinarySearch.search(array, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
