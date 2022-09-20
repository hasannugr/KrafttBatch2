package Day_4_Review;

public class Data_Types_reivew {
    public static void main(String[] args) {         // declare: bildirmek demek  değişkene isim vermek byte b;
        byte  b;
        short s;                                      // java: byte,short,int,long u int olarak kabul eder.
        int   i;
        long  l;                                      //assing= atama operatörü , en temel oparatörtür.(=)


        float  f;
        double d;

        char    c;
        boolean bl;
        System.out.println("--------------------------------------------------------------------------------------------------------------");
  //     byte
        b=127;
        System.out.println(b);
        b=-128;
        System.out.println(b);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
  //     short
        s=32767;
  //     int                                // int 32 bit 4 bayttır. 8 bit 1 bayta eşittir.
        i=2147483647;

     l=2147483647;                           //java: byte,short,int,long u int olarak kabul eder.
     l=2147483648L;                         // temelde int olarak kabul ettiği için ekrana yazdırdı.
     System.out.println("l="+l);           // long int aşan değerli aldığı için sonuna L koyuyoruz aksi halde int diğerlerini kapsıyor.
        System.out.println("--------------------------------------------------------------------------------------------------------------");


  //    float ve double               // Banka hesapları gibi değerleri temsil ederken ve küsüratlı alanlarda kullanılır. expessing currency
      f = 1.1234567F;                 // Sonuna f harfi koyarak float olarak tanımlıyoruz.
      d =1.12345671;
       System.out.println("f ="+ f);
       System.out.println("d= "+ d);
            d=f;                 // kapsar anlamında. //olur çünkü büyük data typei küçüğe atayamayız
            f=(float) d;         //- norrowing casting büyük olanı küçük olana koymak doubledan floatta atamak manuel yaparız.
                                 // içine atayacağımız data tipini yazıyoruz.
                                  //exlipcit conversion / casting down açıktan dönüştürme(narrowing casting de data kaybı olabilir.
        System.out.println(f);

        // -widenning casting (casting up) otamatik olur küçük olandan büyük olana doğru olan shorttan inte gibi
        // implicit conversion/ casting up : kapalı dönüştürme java kendisi yapar.
        //- norrowing casting büyük olanı küçük olana koymak doubledan floatta atamauek manl yaparız.
        // içine atayacağımız data tipini yazıyoruz.
        //exlipcit conversion  ( casting down ) açıktan dönüştürme(narrowing casting de data kaybı olabilir.



    }
}
