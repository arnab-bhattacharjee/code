package dp;

public class CountTheRepetitions {

    private int[] period;

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int firstOccurence = -1;
        int lengthOfOcuurence = 0;
        period = new int[s2.length()];
        for (int i=0,j=0; i<s1.length()*n1-1; i++) {
            if(s1.charAt(i%s1.length()) == s2.charAt(j%s2.length())) {
                if (period[j]%s2.length() == i%s1.length()) {
                    firstOccurence = period[j];
                    lengthOfOcuurence = i-period[j];
                    break;
                }
            }
        }

        if (firstOccurence == -1) return -1;
        return -1;
    }
}
