package miniProjects;

public class Arkadas_Sayi {
    public static void main(String[] args) {

        ///en kucuk 2 arkadas sayi 220 284
        //positive tam bolenlerin cemi = dir

    int sayi1=221;
    int sayi2=284;
    int toplam=0;
    int toplam2=0;
        for (int i = 1; i <sayi1 ; i++) {
            if(sayi1%i==0){
                toplam=toplam+i;
            }

        }
        for (int i = 1; i <sayi2 ; i++) {
            if(sayi2%i==0){
                toplam2=toplam2+i;
            }

        }

        if(sayi1==toplam2 || sayi2==toplam){
            System.out.println("bu iki sayi arkadasdir");
        }else {
            System.out.println("bu iki sayi arkadas degildir");



    }
}}
