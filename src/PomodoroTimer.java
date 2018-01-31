import java.util.TimerTask;

public class PomodoroTimer extends TimerTask {
    public static final int ROUNDS_PER_CYCLE = 4;
    public static final int SECONDS_IN_A_WORK_ROUND = 25;
    public static final int SECONDS_IN_A_BREAK_ROUND = 30;
    public static final int SECONDS_IN_A_BREAK = 5;
    private int timeRemaining;
    private boolean working;
    private int round;

    public PomodoroTimer(){
        this.working = true;
        this.round = ROUNDS_PER_CYCLE;
        this.timeRemaining = SECONDS_IN_A_WORK_ROUND;
    }

    @Override
    public void run(){
        if (this.timeRemaining < 1) {
            if(this.round > 0){
                this.working = !this.working;
                if(this.working){
                    System.out.println("Rounds remaining: " + this.round);
                    System.out.println("start working");
                    this.timeRemaining = SECONDS_IN_A_WORK_ROUND;
                } else {
                    System.out.println("start break");
                    this.timeRemaining = SECONDS_IN_A_BREAK;
                    this.round--;
                }
            } else{
                System.out.println("Start break round");
                this.round = ROUNDS_PER_CYCLE;
                this.timeRemaining = SECONDS_IN_A_BREAK_ROUND;
            }
        } else {
            this.timeRemaining--;
        }
    }

    public int getTimeRemaining(){
        return this.timeRemaining;
    }
}
