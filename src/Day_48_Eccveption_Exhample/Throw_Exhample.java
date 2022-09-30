package Day_48_Eccveption_Exhample;
import static java.lang.Thread.*;

public class Throw_Exhample {

    public static void main(String[] args) throws KraftException {
        throw  new KraftException("Exception atıldı");
        // a_metodu();
    }

    public static void a_metodu(){
        b_metodu();

    }

    public static void b_metodu(){
        try{
            c_metodu();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void c_metodu() throws InterruptedException {
        d_metodu();

    }
    public static void d_metodu() throws InterruptedException {

        sleep(3000);
    }

}
