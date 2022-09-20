package Day_35;

public class Challenge extends GameActivity {

    private int shootOption;
    private int poitOfShoot;
    private int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int poit;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        poitOfShoot = 1000 / shootOption;

        poit = poitOfShoot * shootSucces;


//        score=poit; score değişkeni parent clasta private olduğu için ulaşamadı.
        // setter metodu o sebeple kullanıldı.
        // private değişkenler inharitance olamaz.
        setScore(poit);
    }
}
