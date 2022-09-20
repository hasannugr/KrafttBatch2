package Day_15;

import java.util.Scanner;

public class MethodsTask {
    /*
    Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
    metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
    başka bir metodtan geçirin ve 3 katı olacak şekilde size
    döndürsün. Sonra bu sayıları kabul eden başka bir
    metotla da sayıları toplayın.
    */

    public static void main(String[] args) {

        startProcess();
    }
    public static void startProcess(){

        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        if (sayı2%3!=0){
            sum(sayı1, makeMultipleOfThree(sayı2));
        }else{
            sum(sayı1, sayı2);
        }

    }
    public static int makeMultipleOfThree(int a){
        int multiple3;
        if(a%3>1){
            multiple3=a+1;
        }else{
            multiple3=a-1;
        }
        return multiple3;
    }
    public static void sum(int a, int b){

        System.out.println(a+b);

    }
}


