import java.util.*;

public class BasicSorting {  // O(n2) time complaxty
public static void bubbleSort(int arr[] ){
    for(int turn= 0; turn<arr.length-1; turn++){
        for (int i=0; i<arr.length-1-turn; i++){
            if (arr[i] > arr [i+1] ){
                int temp = arr[i];
                arr[i]  =arr[i+1];
                arr[i+1]= temp;
            }

        }

    }

}    

public static void printArr(int arr[]){
    for (int i = 0 ; i <arr.length; i++){
    System.out.println(arr[i]+"");
    }
    System.out.println();
}
public static void main (String args[]){
    int arr[] = {5,6,4,8,1,9,2,7};
    bubbleSort(arr);
    printArr(arr);
}
}