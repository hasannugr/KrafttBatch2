package Day_13_DoWhile_bracking_labels;

import java.util.Scanner;

public class DoWhile_brancking_labels {
    public static void main(String[] args) {


       /* for (int i=0; i<5; i++){
            System.out.println(i+" ilk dongu");
            for (int j=0; j<5; j++){
                if (j==2){
                    break;
                }
                System.out.println(j +" ikinci dongu");
            }

        }

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("toplam 50 ise programdan cikis oalcaktir.");
            System.out.println("ilk sayiyi giriniz: ");
            int sayı1=scan.nextInt();
            System.out.println("ikinci sayiyi giriniz: ");
            int sayı2=scan.nextInt();
            int toplam=sayı1+sayı2;
            System.out.println("toplam: "+ toplam);
            if (sayı1+sayı2==50){
                break;
            }

        }*/

//        Örnek : Nested loop kullanarak kullanıcıdan hangi işlemi yapmak istediğini sorun. 1-toplama
//        2-Çıkarma 3-çarpma 4-bölme 5-çıkış kullanıcının isteğine göre işlem yapın. Kullanıcının
//        seçimine göre Girilen ekrandan 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç
//        0 ise çıkış ilemi yapılacağını kullanıcıya bildirin.

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1- toplama \n 2- Cikartma \n 3-Carpma \n 4-Bolme \n 5- Cikis ");
            System.out.println("Seciminiz: ");
            int i = scan.nextInt();
            if (i == 1) {
                while (true) {
                    System.out.println("Toplama islemi");
                    System.out.println("1.sayi: ");
                    int a = scan.nextInt();
                    System.out.println("2.sayi: ");
                    int b = scan.nextInt();
                    System.out.println("toplam= " + (a + b));
                    if (a + b == 0) {
                        break;
                    }
                }
                if (i == 2) {
                    while (true) {

                        System.out.println("Cıkartma islemi");
                        System.out.println("1.sayi: ");
                        int c = scan.nextInt();
                        System.out.println("2.sayi: ");
                        int d = scan.nextInt();
                        System.out.println("toplam= " + (c - d));
                        if (c - d == 0) {
                            break;
                        }
                    }
                    if (i == 3) {
                        while (true) {

                            System.out.println("Carpma islemi");
                            System.out.println("1.sayi: ");
                            int e = scan.nextInt();
                            System.out.println("2.sayi: ");
                            int f = scan.nextInt();
                            System.out.println("toplam= " + (e * f));
                            if (e - f == 0) {
                                break;
                            }

                        }
                        if (i == 4) {
                            while (true) {

                                System.out.println("Bolme islemi");
                                System.out.println("1.sayi: ");
                                int g = scan.nextInt();
                                System.out.println("2.sayi: ");
                                int h = scan.nextInt();
                                System.out.println("toplam= " + (g / h));
                                if (g / h == 0) {
                                    break;
                                }
                            }
                        }

                    }

                }

            }

        }
    }
}


