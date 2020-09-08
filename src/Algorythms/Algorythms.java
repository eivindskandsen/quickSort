package Algorythms;

public class Algorythms {

    public static void delsortering(int[]innArray){
        int midlertidigVariabel=0;
        int antallOddetall=0;
        int start=0;

        for(int i=0; i<innArray.length; i++){
            if(innArray[i]%2 !=0){
                midlertidigVariabel=innArray[i];
                innArray[antallOddetall]=innArray[i];
                innArray[i]=midlertidigVariabel;

                antallOddetall++;


            }
        }
        quickSort(innArray,start, antallOddetall);
        quickSort(innArray,antallOddetall, innArray.length-1);
    }

    private static void quickSort(int [] innArray, int start, int slutt) {

        if(start<slutt) {
            int p=partition(innArray, start, slutt);
            quickSort(innArray,start, p-1);
            quickSort(innArray, p+1, innArray.length-1);

        }
    }

    private static int partition(int []a, int start, int slutt){
            int dreieTapp=a[slutt];
            int midlertidigVariabel;
            int i=start;

            for (int j=start; j<slutt; j++){
                if(dreieTapp>a[j]){
                    midlertidigVariabel=a[j];
                    a[start]=a[j];
                    a[j]=midlertidigVariabel;
                    i++;
            }
        }
            midlertidigVariabel=a[i];
            a[i]=a[slutt];
            a[slutt]=midlertidigVariabel;

            return i;
    }
}
