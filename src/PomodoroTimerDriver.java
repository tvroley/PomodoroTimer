import java.util.Scanner;
import java.util.Timer;

/**
 *
 */
public class PomodoroTimerDriver {
    public static PomodoroTimer myPomodoroTimer;
    public static Timer myTimer;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        PomodoroTimerDriver.startTimer();
        String input = myScanner.nextLine();
        while(!input.equals("stop")){
            if(input.equals("time")){
                System.out.println(myPomodoroTimer.getTimeRemaining());
            }
            input = myScanner.nextLine();
        }
        PomodoroTimerDriver.stopTimer();
    }

    public static void startTimer() {
        System.out.println("Pomodoro timer started");
        System.out.println("start working");
        myTimer = new Timer();
        myPomodoroTimer = new PomodoroTimer();
        myTimer.scheduleAtFixedRate(myPomodoroTimer, 0, 1000);
    }

    public static void stopTimer(){
        myPomodoroTimer.cancel();
        myTimer.cancel();
        myTimer.purge();
        System.out.println("Pomodoro timer stopped");
    }
}
