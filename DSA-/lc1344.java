class Solution {
    public double angleClock(int hour, int minutes) {
        // Hour hand angle
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;

        // Minute hand angle
        double minuteAngle = minutes * 6;

        double diff = Math.abs(hourAngle - minuteAngle);

        return Math.min(diff, 360 - diff);
    }
}