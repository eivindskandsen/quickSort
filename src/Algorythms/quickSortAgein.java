package Algorythms;

import java.util.Arrays;

public class quickSortAgein {
    public static void main(String[] args) {
        int[]a={2,3,5,1,7,9,10,11,12};
        quickSort.sorterParOdd(a);

        System.out.println(Arrays.toString(a));

        quickSort.antallPartall(a);
        System.out.println(quickSort.antallPar);

        quickSort.sortering(a,0,8);
        System.out.println(Arrays.toString(a));

    }
}

class quickSort {
    static int antallPar = 0;

    static int[] sorterParOdd(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                temp = a[i];

                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
            }

        }


        return a; //med partall først

    }

    static int antallPartall(int []a){

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                antallPar++;
            }
        }
        return antallPar;
    }

    public static void swap(int [] array, int left, int right){
        int temp =0;
        temp= array[right];
        array[right]= array[left];
        array[left]= temp;
    }

    public static void sortering(int []a, int left, int right){
        if(left >=right){
            return;
        }
        int pivot=a[(left+right)/2];
        int index=partition(a,left, right, pivot);
        sortering(a, left, index-1);
        sortering(a, index, right);
    }

    public static int partition(int []a, int left, int right, int pivot){
        while(left <=right){
            while (a[left]<pivot){
                left++;
            }
            while (a[right]>pivot){
                right--;
            }
            if(left<=right){
                swap(a,left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}




