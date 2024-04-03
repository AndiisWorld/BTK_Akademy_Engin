package arrays;
//Cox istifade olunmur
public class Task2_Coxolculu {
    public static void main(String[] args) {
        //bolgelerdeki seherler
        String [][] sehirler=new String[3][3];//1ci--3bolge 2ci-3 seher
                //ilk[] setir 2ci [] sutun
        //matrisdeki klassik eleman sayisi setir*sutun yeni 1ci[]*2[] = 3*3=9

        sehirler[0][0]="Baki";
        sehirler[0][1]="Sumqayit";
        sehirler[0][2]="Samaxi";
        sehirler[1][0]="Celilabad";
        sehirler[1][1]="Lenkeran";
        sehirler[1][2]="Masalli";
        sehirler[2][0]="Quba";
        sehirler[2][1]="Qusar";
        sehirler[2][2 ]="Xacmaz";

        for (int i=0;i<=2;i++){//setirleri gezirik 0 1 2
            System.out.println("-----------");
            for (int j=0;j<=2;j++){ //her setirdeki bolgeler
                System.out.println(sehirler[i][j]);
                //i-ci elemanin jci qiymeti
            }

        }






    }
}
