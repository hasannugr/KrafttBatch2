package Day_54_CollectionCont2;

import java.util.HashSet;
import java.util.Set;

public class Set_String_HasCode {
    public static void main(String[] args) {
        System.out.println("Murat".hashCode());//74709341

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Murat");
        stringSet.add("Hakan");
        stringSet.add("Murat"); // aynı değerleri kabul etmiyor bir kez yazdırır.

        System.out.println("stringSet = " + stringSet);//[Hakan, Murat]

        Student s1 = new Student("Ahmet", 25);
        Student s2 = new Student("Ahmet", 25);
        Student s3 = new Student("Ahmet", 25);
        Student s4 = new Student("Hasan", 26);

        System.out.println("s1.hashCode() = " + s1.hashCode());//1607521710
        System.out.println("s2.hashCode() = " + s2.hashCode());//1531448569
        System.out.println("s3.hashCode() = " + s3.hashCode());//1867083167

        System.out.println("s1.equals(s2) = " + s1.equals(s2));  // obje ürettiiğimiz sınıfta genarateden equals metotları override ettik oradan çalışıyor.

        Set<Object> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.println("stringSet = " + studentSet);
        System.out.println("studentSet.size() = " + studentSet.size());
        // equals metotdu obje klasına göre çalısırsa size 3 olarak geliyor. ovveride işlemini student classta genarateden yaparsak
        // size 1 olarak geliyor. içerideki ahmetler ve yaşlar eşit olduğu için kişi size 1 olarak geri dönnüyor. farklıl isimde bir obje
        // oluşturursak size da farklı geri dündürüyor. ilk önce kendi classına gidiyor orada ovverride varsa oradan yoksa obje classa gidip oradan
        // equals metodunu çalıştırıyor.


        System.out.println(new String("Murat").hashCode());//74709341
    }
}
