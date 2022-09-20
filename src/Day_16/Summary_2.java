package Day_16;

public class Summary_2 {
    public static void main(String[] args) {
        //    Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırı. 1 ile 7 sonuc 1 6-12(6)

        System.out.println(ebob(50, 60));
    }
        public static int ebob(int x, int y) {
            int sonuc = 1;
            for (int i = 1; i <= Math.max(x, y); i++) {
                if (x % i == 0 && y % i == 0) {
                    sonuc = i;
                }
            }

            return sonuc;
        }

}

