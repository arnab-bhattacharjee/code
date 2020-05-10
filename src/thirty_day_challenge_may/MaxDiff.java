package thirty_day_challenge_may;

public class MaxDiff {

    public int maxDiff(int num) {
        int[] digits = new int[31];

        int n = num;
        for (int i=0; i<digits.length; i++) {
            digits[i] = num%10;
            num/= 10;
        }

        int[] a= new int[31];
        boolean aSet = false;
        boolean notFirst = false;
        int s = 0;
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] == 0 && !notFirst)
                continue;
            if (digits[i] == 9) {
                notFirst = true;
                continue;
            }
            else {
                if (!aSet) {
                    a = digits.clone();
                    s = a[i];
                    a[i] = 9;
                    aSet = true;
                } else {
                    if (s == digits[i])
                        a[i] = 9;
                }
            }
        }
        if (!aSet)
            a = digits.clone();

        int[] b= new int[31];
        boolean bSet = false;
        notFirst = false;
        s = 0;
        int r = 0;
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] == 0)
                continue;
            if (digits[i] == 1) {
                notFirst = true;
                continue;
            }
            else {
                if (!bSet) {
                    b = digits.clone();
                    s = b[i];
                    b[i] = (notFirst) ? 0 : 1;
                    r = b[i];
                    bSet = true;
                } else {
                    if (s == digits[i])
                        b[i] = r;
                }
            }
        }
        if (!bSet)
            b = digits.clone();

        int aNum = 0, bNum = 0;
        for (int i=0; i< digits.length; i++) {
            aNum = (int)Math.pow(10,i)*a[i] + aNum;
            bNum = (int)Math.pow(10,i)*b[i] + bNum;
        }

        return aNum-bNum;
    }
}
