public class DisplayCurrentTime {
    public static void main(String[] args) {
        long totalMs = System.currentTimeMillis();
        long totalS = totalMs/1000;
        long totalM = totalS/60;
        long totalH = totalM/60;
        long currentS = totalS%60;
        long currentM = totalM%60;
        long currentH = totalH%24;
        System.out.format("Current time is %d:%d:%d GMT",currentH, currentM, currentS);
    }
}
