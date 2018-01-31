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
        PomodoroTimer myPomodoroTimer = new PomodoroTimer();
        myTimer.scheduleAtFixedRate(myPomodoroTimer, 0, 1000);
    }
}
