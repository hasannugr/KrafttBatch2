package Day_35_Inharitance;

public class ParentChildTest {

    public static void main(String[] args) {
        ChildClass childClass =new ChildClass();
//        childClass.print_message_P();
        childClass.print_message_C();

        ParentClass parentClass =new ParentClass();
//        parentClass.print_message_C();
//        ERİŞEMİYOR. VE HATA VERİYOR.
//        PARENT CLASS CHİLD CLASSIN METOTLARINA VE FİELDSLARINA ERİŞEEZ
    }
}
