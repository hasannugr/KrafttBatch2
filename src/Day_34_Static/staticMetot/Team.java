package Day_34_Static.staticMetot;

public class Team {

// herkes için geçerli olan class isimleri static olmalıdır. ama herkes için değişen
// sebepler kullanıldığında static olmayan bir metot kullanıllması daha doğru olur.
    String name;
    static int team;

    public Team(String name) {
        this.name = name;
    }

    public static void teamChangeTo(int i) {
        team = i;

    }


    public void getInfo() {
        System.out.println("Team{" + "team= " + team +
                " name='" + name + '}');
    }
}

class main {
    public static void main(String[] args) {

        Team member1 = new Team("bahar");
        Team member2 = new Team("hatice");
        Team member3 = new Team("bilge");
        Team member4 = new Team("cigdem");

        member1.getInfo();
        Team.teamChangeTo(1);

        member1.getInfo();
        member2.getInfo();
        member3.getInfo();
        member4.getInfo();

        Team.teamChangeTo(2);

        member1.getInfo();
        member2.getInfo();
        member3.getInfo();
        member4.getInfo();
    }
}
