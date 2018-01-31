import java.util.TimerTask;

public class PomodoroTimer extends TimerTask {
    private int timeRemaining = 25;
    private boolean working = true;
    private int round = 4;

    public PomodoroTimer(){
        working = true;
        round = 4;
        timeRemaining = 25;
    }

    @Override
    public void run(){
        if (timeRemaining < 1) {
            if(round > 0){
                working = !working;
                if(working){
                    System.out.println("Rounds remaining: " + round);
                    System.out.println("start working");
                    timeRemaining = 25;
                } else {
                    System.out.println("start break");
                    timeRemaining = 5;
                    round--;
                }
            } else{
                System.out.println("Start break round");
                //myTimer.cancel();
                //myTimer.purge();
                round = 4;
                timeRemaining = 30;
            }
        } else {
            //System.out.println(timeRemaining--);
            timeRemaining--;
        }
    }

    public int getTimeRemaining(){
        return this.timeRemaining;
    }
}
