package Day_17_Class_And_Object;

public class Main {
    public static void main(String[] args) {
      /*  Person insan=new Person();
        insan.isim="hasan";
        insan.cinsiyet="erkek";
        insan.yas=26;
        insan.uyu();
        insan.oyunOyna();

        Person insan1=new Person();
        insan1.isim="huseyin";
        insan1.yas=25;
        insan1.cinsiyet="erkek";
        insan1.uyu();
        insan1.oyunOyna();
        System.out.println(insan.isim+ " ile "+ insan1.isim+ " arkadastir." );





       Car tesla_1=new Car();
       tesla_1.model="TESLA";
       tesla_1.marka="EN YENISI";
       tesla_1.havaYatıgı="YASATIR";
       tesla_1.renk="BEYAZ";
       tesla_1.hız=340;
       tesla_1.calıstır();
       tesla_1.hizlan();
       tesla_1.far();
       tesla_1.dur();
        System.out.println("tesla_1.model = "+ tesla_1.model);


        Daire daire1=new Daire();
        daire1.yariCap=4;
        System.out.println("dairemizin alani ="+ daire1.alanHesapla());

        Daire daire_2=new Daire();
        daire_2.yariCap=7;
        System.out.println("dairemizin cevresi= "+ daire_2.cevreHesaplama());


        System.out.println("mat2 = "+  Math2.pow(2, 6));
        */



        Banka person_1=new Banka();
        person_1.hesapAC();
        person_1.setMobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(50);
        person_1.paraYatir(50);


        Banka person_2=new Banka();

        person_2.hesapAC();
        person_2.setMobilBankacilikOnay();
        person_2.paraYatir(429);
        person_2.paraYatir(501);

        person_1.hesapOzeti();
        person_2.hesapOzeti();


    }

}
