package AA_Calısma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listİnterviewSorusu {
    public class ListExhampleİnterview {
        public static void main(String[] args) {
            // interview question
            // List içerisindeki tüm sıfırları listin sonuna yazan metodu yazınız.
            // giriş: 00,2,3,4,5,0,4,5  çıkış: 2,3,5,4,5,0,

            Integer[] arr1 = {0,2,0,3,4,5};
            List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
            System.out.println("moveAllZeroAddEnd(list) = " + moveAllZeroAddEnd(list));
        }

        public  static List<Integer> moveAllZeroAddEnd(List<Integer> list){

            int originalSize = list.size();
            list.removeAll(Arrays.asList(0));       // Arrays.asList(0) içerisindeki 0 ları list içerisinden sil.
            int newSize= list.size();
            int totalSize=originalSize-newSize;
            for (int i = 0; i <totalSize; i++) {
                list.add(0);
            }

            return list;
        }
    }

}
