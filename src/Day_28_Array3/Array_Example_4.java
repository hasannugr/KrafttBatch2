package Day_28_Array3;

public class Array_Example_4 {
    //Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız

    public static String asalSayiBul(int[] arr) {
        String result = "";
        firstLoop:
        for (int sayi : arr) {
            if (sayi == 2) {
                result += sayi + " ";
            } else if (sayi == 0 || sayi == 1) {
                continue firstLoop;
            } else {
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        continue firstLoop;
                    }
                }
                result += sayi + " ";
            }
        }

        return result;
    }
    //Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)

    public static void main(String[] args) {

        int[] sayilar = {5, 6, 3, 4, 2};
        kucuktenBuyugeSirala(sayilar);

    }

    public static int[] kucuktenBuyugeSirala(int[] arr) {

        int depo = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    depo = arr[i];
                    arr[i] = arr[j];
                    arr[j] = depo;
                }

            }
        }
        return arr;

    }

}


