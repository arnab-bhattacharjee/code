package thirtydaychallengejuly;

import java.util.Arrays;

public class PrisonCellAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] cfgToDay = new int[1<<8];
        int[] dayToCfg = new int[1<<8];

        Arrays.fill(cfgToDay, -1);
        int mask = getBitMask(cells);
        cfgToDay[mask] = 0;
        dayToCfg[0] = mask;

        int offset = 0;
        int cycleLength = 0;

        int i=1;
        for (; i<=N; i++) {
            int[] nextCells = new int[cells.length];
            for (int j=0; j<cells.length; j++) {
                if (j-1 >= 0 && j+1 < cells.length && (cells[j-1] == 1 ^ cells[j+1] == 0))
                    nextCells[j] = 1;
                else
                    nextCells[j] = 0;
            }
            cells = nextCells;
            int idx = getBitMask(cells);
            if (cfgToDay[idx] == -1) {
                cfgToDay[idx] = i;
                dayToCfg[i] = idx;
            } else {
                cycleLength = i-cfgToDay[idx];
                offset = cfgToDay[idx];
                break;
            }
        }

        if (i==N+1) {
            return getConfig(dayToCfg[N]);
        }

        int circularLength = N-offset;
        int day = circularLength%cycleLength;

        return getConfig(dayToCfg[offset+day]);

    }

    private int getBitMask(int[] cells) {
        int mask=0;
        for (int i=0; i<cells.length; i++) {
            if (cells[i] == 1)
                mask |= 1<<i;
        }
        return mask;
    }

    private int[] getConfig(int mask) {
        int[] cfg = new int[8];
        for (int i=0; i<8; i++) {
            if ((mask&(1<<i)) >= 1) {
                cfg[i] = 1;
            }
        }
        return cfg;
    }
}
