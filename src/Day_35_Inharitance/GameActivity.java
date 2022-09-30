package Day_35_Inharitance;

public class GameActivity {
    private  double score;

    public double getScore() {
        return score;
    }
    public void setScore(double score){
        this.score=score;
    }
    public String getRenk(){
        String renk;
        if (score>= 800){
            renk="veteran";
        }else if (score>=500){
            renk="advanced";
        }else if (score>=300){
            renk="undead";
        }else {
            renk="beginner";
        }
        return renk;
    }
}
