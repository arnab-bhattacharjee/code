package thirtydaychallengejuly;

public class ClockHands {

    public double angleClock(int hour, int minutes) {
        if (hour == 12)
            hour = 0;

        double hourAngle = ((hour + ((double)minutes/60))/12)* 360;
        double minAngle = ((double)minutes/60)*360;

        double diff = Math.abs(hourAngle-minAngle);
        return (diff>180) ? diff-180:diff;
    }
}
