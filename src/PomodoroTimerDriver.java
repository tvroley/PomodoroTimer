

public class PomodoroTimerDriver {
    public static void main(String[] args) {
        //enter "stop" into the console to exit the program
        //enter "time" to see the time remaining in a period
        PomodoroTimerManager myManager = new PomodoroTimerManager();
        myManager.startTimer();
    }
}
