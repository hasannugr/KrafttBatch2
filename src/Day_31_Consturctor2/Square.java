package Day_31_Consturctor2;

public class Square {

    // Örnek-1
    // Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
    //   calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan bir obje oluşturun

    public int sideLenght;


    public Square() {
    }


    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    public int calculateArea() {   // alan hesaplama
        return (int) Math.pow(this.sideLenght, 2);
    }

    public double calculateArea(int sideLenght) { // alan hesaplama metodu
        return Math.pow(sideLenght, 2);
    }

    public int calculatePerimeter() {  //  cevre hesaplama metodu
        return 4 + this.sideLenght;
    }

    public int calculetePerimeter() {  // cevre hesaplama metodu
        return 4 * this.sideLenght;
    }


}




