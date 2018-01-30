import java.util.Timer;
import java.util.TimerTask;

/**
 *
 */
public class PomodoroTimerDriver {
    //public static volatile boolean running = true;

    public static void main(String[] args) {
        PomodoroTimerDriver.scheduleTimer();
    }

    /*public void stopTimer(){
        running = false;
    }*/

    public static void scheduleTimer() {
        //while (running) {
        System.out.println("Pomodoro timer started");
        System.out.println("start working");
        Timer myTimer = new Timer();
        myTimer.scheduleAtFixedRate(new TimerTask() {
            int timeRemaining = 25;
            boolean working = true;
            int round = 4;

            @Override
            public void run() {
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
                    System.out.println(timeRemaining--);
                }
            }
        }, 0, 1000);
    }
}
