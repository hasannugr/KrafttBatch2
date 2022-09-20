package Day_26_Arrays_Lab;
import java.util.Arrays;
import java.util.Random;

import java.util.Arrays;

public class ArrayExample {

    //Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..(for each)

    public static int toplam(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            result += sayi;
        }
        return result;

    }

    //Array’in içerisindeki tüm çift sayıların
// toplamını veren metodu yazınız.
    public static int toplamCift(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            if (sayi % 2 == 0) {
                result += sayi;
            }
        }
        return result;

    }

    //Array’in içerisindeki tüm 3 sayılarının toplamını
// veren metodu yazınız.
    public static int toplamUc(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            if (sayi == 3) {
                result += sayi;
            }
        }
        return result;

    }
    //   Array’in içerisindeki en büyük ve en küçük sayı
    //   arasındaki farkı bulan metodu yazınız.
    //   (Arrays.sort kullanılmayacak)

    public static int min(int[] arr) {
        int min = arr[0];
        for (int sayi : arr) {

            if (sayi < min) {
                min = sayi;
            }
        }
        return min;


    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int sayi : arr) {
            if (sayi > max) {
                max = sayi;
            }


        }
        return max;


    }


//Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir
    // metod yazınız.(Arrays.sort ve Arrays.fill kullanılmayacak)

    public static int[] enKucukSayiIleDoldur(int[] arr) {
        int[] yeniArray = new int[arr.length];

        int min = arr[0];
        for (int sayi : arr) {
            if (sayi < min)
                min = sayi;
        }

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i] = min;
        }
        return yeniArray;
    }

    public static void arrayYazdir(int[] arr) {
        for (int sayi : arr) {
            System.out.print(sayi + " ");
        }
    }

    public static void arrayYazdir(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void arrayYazdir(char[] arr) {
        for (char str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void arrayYazdir(double[] arr) {
        for (double str : arr) {
            System.out.print(str + " ");
        }
    }


    //2 adet integer sayı alan ve
    // arasındaki sayıları indekslere atayan metodu yazınız. (5,11) 5,6,7,8,9,10,11

    public static int[] araSayılariAta(int a, int b) {
        int max = Math.max(a, b);

        if (max == a) {
            int[] yeniArray = new int[(a - b + 1)];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = b + i;
            }
            return yeniArray;
        } else {
            int[] yeniArray = new int[(b - a + 1)];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = a + i;
            }
            return yeniArray;
        }
    }


    //2 adet array kabul eden ve sonucunda
    // bu 2 array’in verileri ile birlikte
    // tek bir array oluşturan metodu yazınız.

    public static int[] arrayBirlestir(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0, j = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            }
            if (i > a.length - 1) {
                result[i] = b[j];
                j++;
            }
        }
        return result;
    }


    //2 array kabul eden, ilk array in içerindeki
    // tüm sayılar ikinci arrayin içinde yer alıyorsa
    // true yer almıyorsa false yazdıran metodu yazınız.
    //[5,4,3,2,1] , [1,2,3,4,5,7,9] true
    //[2,1,1,2,1,2,1,2] , [1,2] true
    public static boolean arrayControl(int[] a, int[] b) {

        firstLoop:
        for (int i = 0; i < a.length; i++) {
            secondLoop:
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    continue firstLoop;
                }
                continue secondLoop;
            }
            return false;
        }
        return true;
    }
//Array’in içerisindeki sayıları
// ters çevirerek yeni bir array oluşturan metodu yazınız

    public static int[] tersArray(int[] arr) {
        int[] yeniArray = new int[arr.length];
        for (int i = yeniArray.length - 1, j = 0; j < yeniArray.length; i--, j++) {
            yeniArray[j] = arr[i];
        }
        return yeniArray;
    }


    //Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını
    // kullanarak 0-100 arasında
    // rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.

    public static int[] rasgeleArrayUret(int boyut) {
        Random random = new Random();
        int[] yeniArray = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yeniArray[i] = random.nextInt(100);
        }
        return yeniArray;
    }


//Boyutu 500 olan bir array oluşturun ve içerisine
// Random sınıfını kullanarak 50-80 arasında rasgele sayılar atayın.

    public static int[] rasgeleArrayUretElliIleSeksen(int boyut) {
        Random random = new Random();
        int[] yeniArray = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yeniArray[i] = random.nextInt(30) + 50;
        }
        return yeniArray;
    }
//Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını
// kullanarak 120-140 arasında rasgele sayılar atayın.
// Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static void main(String[] args) {
        //int[] sayilar={1,2,3};

        System.out.println(rasgeleArray125Kontrol(5000));
    }

    public static int rasgeleArray125Kontrol(int boyut) {
        Random random = new Random();
        int[] yeniArray = new int[boyut];
        int count = 0;
        for (int i = 0; i < boyut; i++) {
            yeniArray[i] = random.nextInt(20) + 120;
            if (yeniArray[i] == 125) {
                count++;
            }
        }
        return count;
    }


}









