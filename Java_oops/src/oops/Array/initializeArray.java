package oops.Array;

public class initializeArray {
    public static void main(String[] args)
    {

        // initializing array
        int[] arr = { 1, 2, 3, 4, 5 };
        
        int[] arr2 = new int[] {1,2,3};
        
        int[] arr3 = new int[5];

        // size of array
        int n = arr.length;

        // traversing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

