package Day_15;

public class Method_Return_Type {
    public static void main(String[] args) {
//        System.out.println(lastDijitCheck(124,444));
//         boolean bl=lastDijitCheck(235,55);
//        System.out.println("bl= "+ bl);
//        System.out.println(primeNumber(5));
//        System.out.println(dersNotu(130,250,400));


    }


//    Bir method yazın boolean değer dondursun ve 2 sayı
//    kabul etsin sayıların son rakamı aynı ise true farklı ise false döndürsün.

    public static boolean lastDijitCheck(int sayi1, int sayi2){
        if (sayi1%10==sayi2%10){
            return true;
        }
       return false;
    }
//    Bir method yazın boolean değer döndürsün 1 sayı kabul
//    etsin asal sayı ise true versin.

    public static boolean primeNumber(int num){
        if (num==0 || num==1){
            return false;
        }else {
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    return false;
                }
            }
        }
        return true;
    }


//    Bir method yazın ve verdiğiniz sayıyı negatifse pozitif e pozitifse pozitif olarak versin.

    public static int negatif(int a){
//        return a>0 ? a : -a;
        return a<0 ? -a: a;
//       return Math.abs(a);
    }

    public static char dersNotu(int a, int b,int c){
        int ortalama=(a+b+c)/3;
        if (ortalama>76 && ortalama==100){
            return 'A';
        }else if (ortalama>=51 && ortalama<=75){
            return 'B';
        }else if (ortalama>0 && ortalama<=50){
          return 'C';
        }else {
            return 'X';
        }


    }




}
