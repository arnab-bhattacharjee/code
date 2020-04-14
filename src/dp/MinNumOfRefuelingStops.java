package dp;

public class MinNumOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (startFuel >= target) return 0;
        int fuelLeft = startFuel;
        int dist = 0;
        int stops = 0;
        for (int i=-1; i<stations.length; ) {
            if (fuelLeft >= target-dist) break;
            int maxFuel = 0;
            int j=i+1;
            int maxJ = -1;
            while (j<stations.length && fuelLeft >= stations[j][0] - dist) {
                if (maxFuel <= stations[j][1]) {
                    maxFuel = stations[j][1];
                    maxJ = j;
                }
                j++;
            }
            if (maxJ == -1) return -1;
            dist = stations[maxJ][0];
            fuelLeft -= stations[maxJ][0]-((i >= 0)?stations[i][0]:0);
            fuelLeft += stations[maxJ][1];
            stops++;
            i=maxJ;
        }
        return stops;
    }
}
