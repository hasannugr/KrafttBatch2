package Day_31_Constructor;

public class Contsructor_Main {
    public static void main(String[] args) {

        // 1. ismi sınıf ismi ile aynı olmalıdır
        // 2. retrn type yok
        // 3. oluşturulmaz ise boş olarak atama yapıyor
        // 4. sınıfın özel bir metodu
        // 5. ilk olusturma esnasındda constructor cağırılır


//        Flower flower_1=new Flower("beyaz");
//        Flower flower_2=new Flower("mavi",56);
//        Flower flower_3=new Flower("pembe",78,true);
//
//        System.out.print(" "+ flower_1.renk);
//        System.out.print(" "+ flower_1.boy);
//        System.out.println(" "+ flower_1.diken);
//
//
//        System.out.print(" "+ flower_2.renk);
//        System.out.print(" "+ flower_2.boy);
//        System.out.println(" "+ flower_2.diken);
//
//        System.out.print(" "+flower_3.renk);
//        System.out.print(" "+flower_3.boy);
//        System.out.print(" "+flower_3.diken);


        School esogu = new School();
        School esogu_if = new School("yesil", 750);
        School esogu_besyo = new School("kırmızı", 400, 61);

        System.out.println("esogu_if.kapesite = " + esogu_if.kapesite);
        esogu_besyo.kapesiteKontol();
        System.out.println("esogu_if.sinifAdeti = " + esogu_if.sinifAdeti);

        School uu =new School("mavi",7850,78);
        uu.kapesiteKontol();


    }
}
