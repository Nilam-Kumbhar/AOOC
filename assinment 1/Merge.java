import java.util.*;

class Merge {
    int[] arr1 = new int[5];
    int[] arr2 = new int[5];
    int[] merged = new int[10];
    Scanner scanner = new Scanner(System.in);

    void getSortedArray1() {
        System.out.println("Enter 5 sorted elements for Array 1:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = scanner.nextInt();
    }
    }

    void getSortedArray2() {
        System.out.println("Enter 5 sorted elements for Array 2");
        for (int i = 0; i < 5; i++) {
            arr2[i] = scanner.nextInt();
    }
    }

    void mergeArrays() {
        int i = 0, j = 0, k = 0;
        while (i < 5 && j < 5) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < 5)
       {
            merged[k++] = arr1[i++];
        }
        while (j < 5)
        {
            merged[k++] = arr2[j++];
        }
    }

    void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Merge merger = new Merge();

      merger.getSortedArray1();
     merger.getSortedArray2();
        merger.mergeArrays();

        System.out.print("Sorted Array 1: ");
    merger.printArray(merger.arr1, 5);

       System.out.print("Sorted Array 2: ");
     merger.printArray(merger.arr2, 5);

        System.out.print("Merged Array   : ");
     merger.printArray(merger.merged, 10);
   
}}
