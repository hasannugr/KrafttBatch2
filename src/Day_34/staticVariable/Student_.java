package Day_34.staticVariable;

public class Student_ {
    int number;
    String name;

    static String schollName= "KRAFT";

    // STATİCE CEVRİLDİĞİNDE HEPSİ DEĞİŞECEKTİR.

    
//    static int counter;


    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getInfo() {
        return "Student_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schollName='" + schollName + '\'' +
                '}';
    }
}
