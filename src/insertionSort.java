/**
 * Created on 07/Jan/2021 to Insertion-Sort
 */
public class insertionSort {

    public static void insertionSortAlgorithm(int[] arrayForSorting){

        for(int i = 1; i < arrayForSorting.length; i++){
            int key = arrayForSorting[i];
            int j = i - 1;

            while(j >= 0 && arrayForSorting[j] > key){
                arrayForSorting[j + 1] = arrayForSorting[j];
                j = j  - 1;
            }
            arrayForSorting[j + 1] = key;
        }
    }

    public static void printArray(int[] arrayForSorting){
        for(int i = 0; i < arrayForSorting.length; i++){
            System.out.println(arrayForSorting[i]);
        }
    }
    public static void main(String args[]){
        int[] arrayForSorting = {34,12,45,22,90,66,55,39,40};
        insertionSortAlgorithm(arrayForSorting);
        printArray(arrayForSorting);
    }

}


