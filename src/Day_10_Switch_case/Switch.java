package Day_10_Switch_case;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("KACINCI AY ");
        int numOfMonth= scan.nextInt();
        switch (numOfMonth){
            case 1 :
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Agugust");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Novamber");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
        }
    }

        Scanner scan = new Scanner(System.in);
        System.out.println("KACINCI GUN : ");
        int gunler = scan.nextInt();
        switch (gunler) {
            case 1:
                System.out.println("PAZARTESI");
                break;
            case 2:
                System.out.println("SALI");
                break;
            case 3:
                System.out.println("CARSAMBA");
                break;
            case 4:
                System.out.println("PERSEMBE");
                break;
            case 5:
                System.out.println("CUMA");
                break;
            case 6:
                System.out.println("CUMARTESİ");
                break;
            case 7:
                System.out.println("PAZAR");
                break;

        }



        int num=42 ;

        switch (num){
            case 38,40,42:
                System.out.println(num+ " bir small bedendir.");
                break;
            case 44,46,48:
                System.out.println(num+ " bir medium bedendir.");
                break;
            case 50,52,54:
                System.out.println(num+ " bir large bedendir.");
                break;
            default:
                System.out.println("Gırılen numara ıle eslesen bır bedenımız yoktur.");

        }*/
//        Switch yapısını kullanarak basit bir hesap makinesi
//        yapın. Mümkünse değerleri console den alın
//        Reminder: 2 int değer belirleyin ve 4 işlem için 4
//        case olsun.

        System.out.println("HESAP MAKINASINA HOSGELDINIZ");
        Scanner scan=new Scanner(System.in);
        int sayı1=scan.nextInt();
        scan.nextLine();
        String  arıtmetık = scan.nextLine(); //    +,-,*,/ gibi matematik işlemini giriyoruz.
        int sayyı2=scan.nextInt();

        int sonuc =0;

        switch (arıtmetık){
            case "+":
                sonuc = sayı1+sayyı2;
                System.out.println("sonuc: "+ sonuc);
                break;

            case "-":
                sonuc = sayı1-sayyı2;
                System.out.println("sonuc: "+ sonuc);
                break;
            case "*":
                sonuc = sayı1*sayyı2;
                System.out.println("sonuc: "+ sonuc);
                break;
            case "/":
                sonuc = sayı1/sayyı2;
                System.out.println("sonuc: "+ sonuc);
                break;
            default:
                System.out.println("girdiginiz matematiksel isaret yanlistir.");
        }


    }
}