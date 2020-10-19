package Algorythms;

public class algoritms {

    public static void delsortering(int[] a) {
        //Initierer verdier
        int lengde = a.length;
        int x = 0;
        int y = 0;
        int bytt;
        //Gaar igjennom arrayet, ser etter oddetall og flytter dem frem i arrayet
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                bytt=a[y];
                a[y]=a[i];
                a[i]=bytt;
                y++;
            }
        }
        //Sorterer partall og oddetall hver for seg
        quickSort(a,x,y-1);
        quickSort(a,y,lengde-1);
    }

    private static void quickSort(int[]a, int start, int slutt){
        //Sjekker om start er mindre enn slutt
        if(start<slutt){
            //Bruker partisjon til aa sortere tallene
            int p = partition(a,start, slutt);
            quickSort(a,start,p-1);
            quickSort(a,p+1,slutt);
        }
    }


    private static int partition(int[]a, int start, int slutt){
        int dreietapp = a[slutt];
        int i = start;
        int bytt;
        //Gaar igjennom arrayet
        for(int j = start; j < slutt; j++){
            //Sjekker om dreietappen er stoerre enn arrayets naavaerende tall og bytter plass på tallet hvis dreietappen er stoerre
            if(dreietapp > a[j]){
                bytt = a[i];
                a[i] = a[j];
                a[j] = bytt;
                i++;
            }
        }
        //Bytter plassen på dreietappen og det stoerre tallet i arrayet
        bytt = a[i];
        a[i] = a[slutt];
        a[slutt] = bytt;
        //returnerer indexen
        return i;
    }
}
