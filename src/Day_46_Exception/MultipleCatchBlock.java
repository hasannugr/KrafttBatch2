package Day_46_Exception;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        System.out.println("program başladı");
        /*
        try {
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("ArrayIndexOutOfBoundsException yakalandı");
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("exception alındı");
        }finally {
            System.out.println("finally bloğu çalıştı");
        }
*/

        try {
            System.out.println(5 / 0);
        } finally {
            System.out.println("finally bloğu çalıştı");
        }


        System.out.println("program sonlandı");
    }
}
