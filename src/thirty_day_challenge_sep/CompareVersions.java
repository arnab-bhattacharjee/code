package thirty_day_challenge_sep;

public class CompareVersions {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int n = Math.max(v1.length, v2.length);

        for (int i=0; i<n; i++) {
            int r1 = 0;
            if (i<v1.length)
                r1 = Integer.parseInt(v1[i]);
            int r2 = 0;
            if (i<v2.length)
                r2 = Integer.parseInt(v2[i]);
            if (r1 > r2)
                return 1;
            if (r1 < r2)
                return -1;

        }

        return 0;
    }
}
