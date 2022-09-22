package Day_42_OOP_Review;

public class Daire extends GeometrikSekiller{
    private final static double PI = 3.14;
    private double radius;
    static {
        System.out.println("static metot bir defa çalışır");
    }
    {
        System.out.println("instance metot her defa çalışır.");
    }


   public Daire() {
    }

    public Daire(int radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("yarıçap 0 ve 0 dan büyük olamaz.");
        }
    }

    public double getRadius() {
        return radius;
    }
//   consturactor protected olarak tanımlarsak farklı bir paket içerisnde obje oluşturulmasına izin vermez.
    public double alan() {
        return PI * Math.pow(radius, 2);
    }

    public double cevre() {
        return 2 * PI * this.radius;
    }

    public static double alan(double radius) {
        return PI * radius * radius;
    }

    public static double cevre(double radius) {
        return 2 * PI * radius;
    }


}
