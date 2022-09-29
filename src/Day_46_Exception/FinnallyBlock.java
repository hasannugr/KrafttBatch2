package Day_46_Exception;

public class FinnallyBlock {
    public static void main(String[] args) {

        System.out.println("programa giriş yapıldı");

        try {
            System.out.println("try bloğunun içi");
            int x = 5 / 0;
            System.out.println("merhaba");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("catch bloğu çalıştı");

        } finally {

            System.out.println("finally bloğu çalıştı");

        }

        System.out.println("program bitti");


    }
}
