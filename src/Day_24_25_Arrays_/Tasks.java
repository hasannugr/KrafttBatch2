package Day_24_25_Arrays_;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {

        int[] iArr = {1,2,3,8,5,6,7};
        int[] iArr2 = {1,2,3,4,5};
        int[] sayılar = {1000,3348374,1,5};
        int[] sayılar2 = {100,33,48,37,1,5};
        String str = "merhaba java insanları bugün nasılsınız";
        String str2 = "kayısı, armut, üzüm, çilek, nar";
        String str3 = "elma, armut, üzüm, çilek, nar";
        String str4 = "merhaba java insanları bugün nasılsınız";

//        System.out.println(Arrays.toString(stringToArray(str)));
//        System.out.println(Arrays.toString(stringToArray2(str2)));
//        System.out.println(Arrays.toString(stringToArray3(str3)));
//        System.out.println(Arrays.toString(stringToArray4(str4)));
//        System.out.println(checkLength(iArr));
//        System.out.println(find5(iArr));
//        System.out.println(find5(sayılar));
//        System.out.println(compareFirstElements(iArr, iArr2));
//
//        System.out.println(Arrays.toString(   newArrWithFirstElements(iArr, iArr2)   ));
//        System.out.println(sumArryElemens(iArr2));
//        System.out.println(Arrays.toString(concatArry(iArr, iArr2)));
//        System.out.println(bigOne(iArr));
//        System.out.println(   Arrays.toString(  swapFirstAndLast(iArr)  ) );
//        System.out.println(Arrays.toString(  reverseArry(iArr2)  ));
//        System.out.println(sumOfOddIdx(iArr));
//        System.out.println(Arrays.toString(nBoy(10)));
//        System.out.println(arithmetic(sayılar2));
//        System.out.println(Arrays.toString(fillWithSmallestElement2(sayılar2)));

        String str5 = "merhaba java insanları bugün nasılsınız";

        System.out.println(Arrays.deepToString(splitArray(str5)));

    }
//    Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean checkLength(int[] iArr){
        return iArr.length>5;
    }
//    Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.
    public static boolean find5(int[] arry){
        int param = 5;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==param){
                return true;
            }
        }
        return false;
    }
//    Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
    public static boolean compareFirstElements(int[] iarr1, int[] iarr2){
                return iarr1[0]==iarr2[0];
    }
//    2 array kabul eden bir method yazın ve arraylerin ilk elemanları ile yeni bir array döndürsün.
    public static int[] newArrWithFirstElements(int[] iArr1,int[] iArr2){
            int[] newArr = new int[2];
//            int[] newArr = {iArr1[1],iArr2[3]};
            newArr[0]=iArr1[0];
            newArr[1]=iArr2[0];
            return newArr;
    }
//    Int array in elemanlarının toplamını veren bir method yazın
    public static int sumArryElemens(int[] iArr){
            int sum = 0;
        for (int i = 0; i < iArr.length; i++) {
            sum+=iArr[i];
            sum = sum+iArr[i];
        }
        return sum;
    }
//    Verilen 2 arrayi birleştirip array döndüren bir method yazın.
                                        //7         //5
    public static int[] concatArry(int[] Arr1, int[] Arr2){
        int[] newArry = new int[Arr1.length+Arr2.length];
        for (int i = 0;
             i < newArry.length;
             i++) {
            if (i<Arr1.length){
                newArry[i]=Arr1[i];
            }else{
                newArry[i]=Arr2[i-Arr1.length];
            }
        }
        return newArry;
    }
//    İnt arry in en büyük elemanının döndüren bir method yazın
    public static int bigOne(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
//    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] swapFirstAndLast(int[] arr){
        int temp;

        temp = arr[0];
        arr[0]=arr[arr.length-1]; //{7,2,3,4,5,6,7}
        arr[arr.length-1] = temp; //{7,2,3,4,5,6,1}
        return arr;
    }
//    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] reverseArry(int[] arr){
        int[] ints = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[(arr.length-1)-i];
        }
        return ints;
    }
//    Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static int sumOfOddIdx(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
                sum+=arr[i];
        }
        return sum;
    }
//    «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//    element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[] stringToArray(String str){
        return str.split(" ");
    }
//    «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//    varsa onun yerine çilek atayın.
    public static String[] stringToArray2(String str){
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length()<5){
                split[i]="çilek";
            }
        }
        return split;

    }
//    «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//      element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.
    public static String[] stringToArray3(String str){
        String[] split = str.split(", ");

        String temp = split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;

        return split;
    }
//    «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
//    harflerinden array döndüren method yazın.
    public static String[] stringToArray4(String str){
        String[] arr = str.split(" ");
        return arr[1].split("");
    }
//    Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
//    biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4].
    public static int[] nBoy(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i;
        }
        return arr;
    }
//    karmaşık Bir sayı dizisinin en büyük ve en küçük değerli element lerinin aritmetik ortalamasını
//     veren bir method yazın.
    public static int arithmetic(int[] arr){
        Arrays.sort(arr);
        return (arr[0]+arr[arr.length-1])/2;
    }
//    Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
//      method yazın.
    public static int[] fillWithSmallestElement(int[] arr){
        Arrays.sort(arr);
        Arrays.fill(arr,arr[0]);
        return arr;

    }
//    Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
//    onunla dolduran bir method yazın.
    public static int[] fillWithSmallestElement2(int[] arr){
    Arrays.sort(arr);
    Arrays.fill(arr,0,arr.length-1,arr[0]);
    return arr;

}
//«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
//insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    public static String[][] splitArray(String str){
        String[] arr = str.split(" ");

        String[] strings = Arrays.copyOfRange(arr, 0, 3);
        String[] strings1 = Arrays.copyOfRange(arr, 3, 5);
        String[][] forReturn = {strings,strings1};
        return forReturn;

    }





}
