package AA_Calısma;

import java.util.ArrayList;

public class ınterviewSorusu {
    public static void main(String[] args) {
        /* kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
    gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
            metod(sayilar,kaymaMiktari)

            0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
            0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1*/



        int[] array={0,1,2,3,4,5};
        System.out.println(sayiKaydir(array,2));


        }

    public static ArrayList<Integer>sayiKaydir(int[] array,int kaymaMiktari){
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int sayi:array) {
            arrayList.add(sayi);
        }
        for (int i = 0; i <kaymaMiktari ; i++) {
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        return arrayList;
    }


}

