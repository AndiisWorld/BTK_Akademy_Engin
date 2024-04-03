package arrays;

public class Massivler {
    public static void main(String[] args) {


        //telebeler
        String ogrenci1="Engin";
        String ogrenci2="Amil";
        String ogrenci3="Eli";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("--------");

        String[] ogrenciler= new String[3 ];//3elemanli dizi
        ogrenciler[0]="Demirog";
        ogrenciler[1]="Mansurov";
        ogrenciler[2]="Elekberov";


        for (int i=0;i< ogrenciler.length;i++){
            //length = string[3] = 3 yeni i <3;
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------");
        for (String ogrenci:ogrenciler){ //ogrenci istediyimiz seyi yaza bilerik
            System.out.println(ogrenci);
        }
    }
}
