package Day_24_25_Arrays_;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] iArr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] iArr2 = {1, 2, 3, 4, 5};
        int[] sayılar = {100, 314521, 1, 5};
        String str = "merhaba java insanlari bugün nasilsiniz»";
//        System.out.println(Arrays.toString(stringtoArray(str)));
        String str2 = "kayısı, armut, üzüm, çilek, nar";
        String str4 = "merhaba java insanları bugün nasılsınız ";


//        System.out.println(work1(iArr1));
//        System.out.println(find5(iArr1));
//        System.out.println(firstValue(iArr1,iArr2));
//        System.out.println(Arrays.toString(newArrWhitFirstElements1(iArry,iArr2)));
//       System.out.println(toplam(iArr2));
//        System.out.println(Arrays.toString(concatArry(iArr1, iArr2)));
        System.out.println(bigOna(iArr1));
//        System.out.println(Arrays.toString(swapFirstAndLast(iArr1)));
//        System.out.println(Arrays.toString(reserveArry(iArr1)));
//        System.out.println(sumOfOddIdx(iArr2));
//        System.out.println(Arrays.toString(stringtoArray(str)));
//        System.out.println(Arrays.toString(meyveler(str2)));
//        System.out.println(Arrays.toString(stringToArray3(str2)));
//        System.out.println(Arrays.toString(stringToArray4(str4)));
//        System.out.println(Arrays.toString(nBoy(10)));
//        System.out.println(Arrays.toString(fillWithSmallestElement(sayılar)));
//        System.out.println(Arrays.toString(fillWithSmallestElement2(sayılar)));

    }


//    bir method yazın ve int[] kabul etsin length i 5 den büyükse true dondursun.

    public static boolean work1(int[] iArry) {
        return iArry.length > 5;
    }

//    bir method yazın int array kabul etsin içinde 5 değeri olup olmadığını kotrol etsin.

    public static boolean find5(int[] iArry) {
        int param = 5;
        for (int i = 0; i < iArry.length; i++) {
            if (iArry[i] == param) {
                return true;
            }
        }
        return false;
    }


    //    bir method yazın ve iki array kabul etsin ilk elemanları eşitse true dondursun.
    public static boolean firstValue(int[] array1, int[] array2) {
        if (array1[0] == array2[0]) {
            return true;
        }
        return false;
    }

//    iki array kabl eden bir method yazın ve arraylatıin ilk elemanları ile yeni bir array dondursun.

    public static int[] newArrWhitFirstElements1(int[] iArr1, int[] iArr2) {
        int[] newArr = new int[2];
        newArr[0] = iArr1[0];
        newArr[1] = iArr2[0];
        return newArr;
    }

//    int array eleamnlarının toplamını donduren method yazınız.

    public static int toplam(int[] iArr1) {
        int sonuc = 0;
        for (int i = 0; i < iArr1.length; i++) {
            sonuc += iArr1[i];
        }
        return sonuc;
    }

//    verilen iki arrayi birleştip array donduren bir method yazın.

    public static int[] concatArry(int[] iArr1, int[] iArr2) {
        int[] newArray = new int[iArr1.length + iArr2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < iArr1.length) {
                newArray[i] = iArr1[i];
            } else {
                newArray[i] = iArr2[i - iArr1.length];
            }
        }
        return newArray;
    }


    //    İnt arry in en büyük elemanının döndüren bir method yazın
    public static int bigOna(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] swapFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    //    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] reserveArry(int[] arr) {
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[(arr.length - 1) - i];
        }
        return ints;
    }

//    Bir methodla verilen array ın tek sayı indexinde bulunan elemanların toplamını alın.

    public static int sumOfOddIdx(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
//    «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//    element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringtoArray(String str) {
        return str.split(" ");
    }

    //    «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//    varsa onun yerine çilek atayın.
    public static String[] meyveler(String str) {
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() < 5) {
                split[i] = "cilek";
            }
        }
        return split;
    }
//    «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.

    public static String[] stringToArray3(String str) {
        String[] split = str.split(",");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;
        return split;
    }

//    «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
//    harflerinden bir döndüren method yazın.

    public static String[] stringToArray4(String str) {
        String[] arr = str.split(" ");
        return arr[1].split("");
    }

//    Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
//    biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

    public static int[] nBoy(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

//   Karmaşık  bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
//    veren bir method yazın.


    public static int aritmetic(int[] arr) {
        Arrays.sort(arr);
        return (arr[0] + arr[arr.length - 1]) / 2;
    }

//    Bir sayı dizisinin en küçük harfi ne ise sayı dizisini onunla dolduran bir
//    method yazın.

    public static int[] fillWithSmallestElement(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, arr[0]);
        return arr;
    }

    //    Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
//    onunla dolduran bir method yazın.
    public static int[] fillWithSmallestElement2(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, 0, arr.length - 1, arr[0]);
        return arr;
    }


}
