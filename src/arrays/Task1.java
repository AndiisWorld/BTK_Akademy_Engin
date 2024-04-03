package arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] myList1 = new double[4];
        //diger yontemi new double[4] yerin {3,4,5,6,5} kimi yaza biler



        double[] myList={1,2,3,4,5,6};

        //en buyuk sayi
        double max=myList[0];//meselen
       double total=0;//cem

        for (double number:myList){
            if(max<number){
                max=number;
            }
            total=total+number;//(0+1=1;1=1+2=3;3=3+4=7;
            System.out.println(number);
        }
        System.out.println("Toplam = "+ total);
        System.out.println("En buyuk = " + max);





    }
}
