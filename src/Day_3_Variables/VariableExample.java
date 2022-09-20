package Day_3_Variables;

public class VariableExample {
    public static void main( String[]args){

        byte sayi=1;
        //sayi=127;
        sayi=56;
        System.out.println(sayi);

        //short


        short sayi2=32000;
        System.out.println(sayi2);
        sayi2=31000;
                System.out.println(sayi2);
                short sayi3=31000;
                System.out.println((sayi2+sayi3));

         //int


         int sayi4=5;
        System.out.println(sayi4);

        //long


        long sayi5=57163214531071L;    //long tipinde olanlarda sayı sonuna büyük "L" ifadesi ekenir.
        System.out.println(sayi5);

        //fload


        float a=1;        // Küsüratlı sayılar verir bunun çıktısı "1.0" şeklinde olur.
        float text=1.2f;      // FLOAT DEĞİŞKENİNDE NOKTALI SAYILARI BELİRTMEK İÇİN SAYININ SONUNA KÜÇÜK (f) KOYULUR.
        System.out.println(text);


        // double


        double b=5.4;
        System.out.println(b);

        //boolean

        boolean devam=true;       // FALSE DEĞERİ =0 TRUE DEĞERİ=1 ŞEKLİNDE DEĞER ALIR.
        System.out.println(devam);
        boolean tanımlama =5>4;
        System.out.println(tanımlama);


        //char


        char ornek1=65;               //SAYI DEĞERİ ALIR ANCAK TEK BİR KARAKTER İFADE EDER- STRİNGLERDE KULLANACAĞIZ.
        b='G';                   // TEK TIRNAK KULLANILARAK UYGULANIR.
        char c= 'G'+'K';          // Toplama işlemi yapmaz yanlış kullanım. / Tek karakter laradock kullanılır yanlış kullanım.
        System.out.println(c);

String metin="bugun hava cok guzel";   // STRİNG İFADELER ÇİFT TIRNAK OLARAK UYGULANIR. -BOŞLUKLAR KARAKTERTİR
//System.out.println(a);
String metin2= " gunes parliyor ";         // + ifadesi toplama ve birleştirme yapar.
//System.out.println(metin+"\t"+metin2);    //  -\t- ifadesi boşluk atar.

int orneksayı= 5;
System.out.println(metin+orneksayı);         // UTF-8 HATASINDA EVRENSEL BİR DİL KARAKTER ÇÖZÜMLEMESİ YAPILMASI GEREKİR.

int elma=2,armut=5,kiraz=5;          // BU ŞEKİLDE BİR ÇOK TANIMLAMA YAPILIR.HER BİRİNE AYRI ATAMA YAPILABİLİR.
System.out.println(elma+armut+kiraz); // int a=2; b=5; c=5; AYNI DATA TYPELARI BİRLİKTE TANIMLANABİLİR. İNTE FLOAD TANIMLANAMAZ.
        byte   ap=15;
        short  bat=20;
        int    car=45;
        long   d=5;           // değişken isimleri küçük harfle başlar.
        float  e=8.7f;
        double f=6.7;
        boolean g= false;
        char h= 'D';

        System.out.println(ap+""+bat+car+d+e+f+h);
        char ch='G'+ 'D';
        System.out.println(ch);


        // System.out.println(5+10+"Ahmet"+20+30);
        // ahmet başa gelirse Ahmet2030 seklinde yazar ahmet ortaya gelirse
        // toplama yapar ve sonrasını 15ahmet2030 yazar ("Ahmet"+(5+10) şeklinde yazılırsa Ahmet15 yazar.



short yıl=2022 ;
byte yas=20;
String ad="Ahmet ";
System.out.println(ad +yıl +" de "+ yas + " yasinda olacak. ");
        int i,j;
        j=5;
        i=j;
        System.out.println(i);

        int  in,ja,k;     // short ilede yazılabilir ama boyut olarak değişir.
        in=5;
        ja=10;
        k=in;
        i=ja;
        System.out.println(i);
        System.out.println(ja);
        System.out.println(k);

        double ahmet =10.9;
        float mehmet = 20.3f;
        byte omer    =2;
        double ali   =ahmet+mehmet;
        System.out.print(ali);

        int an = 15, ba = 25, ca = (an + ba) / 2;

        ca=(an+ba)/2;
        System.out.println(ca);          // ((an+ba)/2); şeklinde de yazılabilir- çift parantez şeklinde.

        double at=10.9;            // Farklı ifadeleri alt satıra yazarsak daha güzel olur.
        String bak="GS";
        System.out.println(at+bak);

        int ay=5, bay=5, cay=ay/bay;       // int noktadan sonrasını görmez. 10.9 gibi sayılarda double kullanılır.
        System.out.println(cay);

        String name="HASAN HUSEYIN ";
        char al= 'U',bal='G',cal='U',dar='R';
         String isim= ad +al+bal+cal+ dar;
        System.out.println(" "+ isim );











    }
}
