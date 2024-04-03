package miniProjects;

public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9};
        int aranacak=2;
        boolean varMi=false;
        //aranacaq sayi bu arrayin icerisinde varmi ya yox
        for (int sayi:sayilar){
            if (sayi==aranacak){
               // System.out.println("Sayi mevcuttu");
            varMi=true;
            break;
            }
        }
        if(varMi){
            System.out.println("Sayi mevcuttur");
        }else {
            System.out.println("Sayi mevcut degil");
        }

    }
}
  /*for (int i = 0; i < sayilar.length; i++) {
        if(aranacak==sayilar[i]){
        System.out.println("Sayi bulundu");
                break;
                        }else{
                        System.out.println("Sayi bulunmadi");
            break;}

                    }
                    bu menim yazdigim
   */