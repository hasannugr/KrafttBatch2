package Day_31_Consturctor2;

import java.util.Random;

public class KraftBank {

//    Örnek-4
//KraftBank adında bir class oluşturun, customerId, customerFullName, isSms,
//customerAccount, customerToken, adında fields tanımlayın,
//1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
//3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki
//harfi+1000-9999 rasında random bir sayı ile otomatik oluşturulacak.
//4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için class
//içerisinde addMoney adında bir metot yazılacak.

    public int customerId;
    public  static String customerFullName;
    public boolean isSms;
    public double customerAccpunt;
    public static String customerToken;
//    private yapıldığında dışarıdan değiştirilemez ve kullanılamaz sadece class içerisine kullanılır.

    public KraftBank(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        Random random=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2)+(random.nextInt(1000)+8999);
    }
    public void  addMoney(double money){
    this.customerAccpunt+=(money*18.22);
    }

}
