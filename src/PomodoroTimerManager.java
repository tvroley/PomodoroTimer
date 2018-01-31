import java.util.Scanner;
import java.util.Timer;

public class PomodoroTimerManager {
    public static final int MILLISECONDS_IN_A_SECOND = 1000;
    private PomodoroTimer myPomodoroTimer;
    private Timer myTimer;

    public PomodoroTimerManager(){
        this.myTimer = new Timer();
        this.myPomodoroTimer = new PomodoroTimer();
    }

    public void startTimer() {
        System.out.println("Pomodoro timer started");
        System.out.println("start working");
        this.myTimer.scheduleAtFixedRate(myPomodoroTimer, 0, MILLISECONDS_IN_A_SECOND);
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        while(!input.equals("stop")){
            if(input.equals("time")){
                System.out.println(myPomodoroTimer.getTimeRemaining());
            }
            input = myScanner.nextLine();
        }
        this.stopTimer();
    }

    public void stopTimer(){
        this.myPomodoroTimer.cancel();
        this.myTimer.cancel();
        this.myTimer.purge();
        System.out.println("Pomodoro timer stopped");
    }
}
