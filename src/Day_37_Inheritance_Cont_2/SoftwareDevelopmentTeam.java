package Day_37_Inheritance_Cont_2;


public class SoftwareDevelopmentTeam extends Person {
    private String teamName;
    private String domain;
    private int numberOfPersonel;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getNumberOfPersonel() {
        return numberOfPersonel;
    }

    public void setNumberOfPersonel(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }
}