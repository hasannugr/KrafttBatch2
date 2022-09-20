package Day_31_Constructor;

public class School {
    //Okul adında bir sınıf oluşturun
// fields: rengi; kapasite; sinifAdedi;
// methods: Kapasite>500 kapasite aşılmıştır ikazı versin.  min 3 adet constructors yazın..

    public String renk;
    public int kapesite;
    public int sinifAdeti;

    public School (){
        System.out.println("paraemetresiz constructor");

    }

    public School(String renk) {
        this.renk = renk;
    }

    public School(String renk, int kapesite) {
        this("pembe");
        this.renk = renk;
        this.kapesite = kapesite;
    }

    public School(String renk, int kapesite, int sinifAdeti) {
        this.renk = renk;
        this.kapesite = kapesite;
        this.sinifAdeti = sinifAdeti;
    }

    public void kapesiteKontol() {
        if (this.kapesite > 500) {
            System.out.println("Kapesite asilmistir.");
        } else {
            System.out.println("kapesite asilmasina " + (500 - this.kapesite) + " kalmistir.");
        }
    }

}