import java.util.Arrays;
import java.util.Random;
public class Score {
    private String competitorName;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;
    
    public void setCompetitorName(String name) {
        this.competitorName = name;
    }
    public void setScore1(int score) {
        this.score1 = score;
    }
    public void setScore2(int score) {
        this.score2 = score;
    }
    public void setScore3(int score) {
        this.score3 = score;
    }
    public void setScore4(int score) {
        this.score4 = score;
    }
    public void setScore5(int score) {
        this.score5 = score;
    }

    
    public String getCompetitorName() {
        return this.competitorName;
    }
    
    Score(String name) {
        this.setCompetitorName(name);
        Random rand = new Random();
        this.setScore1(rand.nextInt(5)+1);
        this.setScore2(rand.nextInt(5)+1);
        this.setScore3(rand.nextInt(5)+1);
        this.setScore4(rand.nextInt(5)+1);
        this.setScore5(rand.nextInt(5)+1);
    }

    public float calculateFinalResult() {
        int[] scores = new int[]{this.score1, this.score2, this.score3, this.score4, this.score5};
        Arrays.sort(scores);
        return (scores[1] + scores[2] + scores[3])/3;
    }
    
    public void displayFinalResult() {
        System.out.println("Name: " + this.getCompetitorName() + " Final score: " + this.calculateFinalResult());
    }
    
    public static void main(String[] args) {
        Score test1 = new Score("Marek");
        Score test2 = new Score("Darek");
        Score test3 = new Score("Jarek");
        
        test1.displayFinalResult();
        test2.displayFinalResult();
        test3.displayFinalResult();
    }
}