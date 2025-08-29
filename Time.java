public class Time {
    // Data Members
    static long currentTime;
    static long oldTime;

    // Constructor
    Time() {
        currentTime = System.nanoTime();
    }
    
    public static long getElapsedTime() {
        oldTime = currentTime;
        currentTime = System.nanoTime();
        return currentTime - oldTime;
    }
}
