package Day_34.staticMetot;

public class Candidate {

    // conturctor nesle ile alakalı olarak çalışır.
    // bu sebeple static olanlardan consturoctorlar calışmaz yapılamaz.

    String name;
    int schoolID;

    static String branch;
    static int counter;

    public Candidate(String name) {
        this.name = name;
        schoolID = setNumber();

    }

    public static int setNumber() {
        counter++;
        return counter;
    }

    public static void setBranch(String str) {
        branch = str;
    }

    public void getIno() {
        System.out.println(name);
        System.out.println(branch);
        System.out.println(schoolID);
    }
}

class Main3 {
    public static void main(String[] args) {
        Candidate candidate = new Candidate("fatih");
        Candidate candidate2 = new Candidate("kanuni");
        Candidate candidate3 = new Candidate("yavuz");
        Candidate.setBranch("JAVA");


        candidate.getIno();
        candidate2.getIno();
        candidate3.getIno();

    }
}
