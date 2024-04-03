package miniProjects;

public class Asal_Sayi {
    public static void main(String[] args) {
        int number=1;
        //asal olub olmamasi ---
       // int remainder=number%2;
       // System.out.println(remainder);
        boolean isPrime=true; //sayi asalmi prime
        if(number== 1){
            System.out.println("Asal sayi degildir");
            return;
        }
        if(number<2){
            System.out.println("Gecersiz sayi");
        }
        if(number<1){
            System.out.println("Asal sayi degildir");
        }
        for (int i = 2; i <number ; i++) {//2-den 24-e qeder hamsini 25e bolmek
            if(number%2==0){
                isPrime=false;
            }

        }
        if(isPrime){ //hecnesiz true verir
            System.out.println("Sayi asaldir");
        }
        else{
            System.out.println("Sayi asal degildir");
        }


    }
}
//sayi 1 asal degil en kucuk 2dir asal sayi
