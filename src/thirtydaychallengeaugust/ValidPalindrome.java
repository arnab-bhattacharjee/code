package thirtydaychallengeaugust;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i<n-1) i++;
            while (!Character.isLetterOrDigit(s.charAt(j)) && j>=0) j--;
            if (i >= j) break;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
}
