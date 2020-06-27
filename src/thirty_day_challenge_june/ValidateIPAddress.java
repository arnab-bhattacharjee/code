package thirty_day_challenge_june;

public class ValidateIPAddress {

    public String validIPAddress(String IP) {
        if (IP.length() == 0)
            return "Neither";
        if (isIPv4(IP)) {
            return "IPv4";
        } else if (isIPv6(IP)) {
            return "IPv6";
        } else return "Neither";
    }

    private boolean isIPv4(String IP) {
        if (!Character.isLetterOrDigit(IP.charAt(0)))
            return false;
        if (!Character.isLetterOrDigit(IP.charAt(IP.length()-1)))
            return false;
        String[] s = IP.split("\\.");
        if (s.length != 4)
            return false;
        for (String str: s) {
            if (str.length() > 3 || str.length() == 0)
                return false;
            if (str.length()>1 && str.charAt(0) == '0')
                return false;
            if (str.charAt(0) == '-')
                return false;
            try{
                int num = Integer.parseInt(str);
                if (num<0 || num>255)
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private boolean isIPv6(String IP) {
        if (!Character.isLetterOrDigit(IP.charAt(0)))
            return false;
        if (!Character.isLetterOrDigit(IP.charAt(IP.length()-1)))
            return false;
        String[] s = IP.split("\\:");
        if (s.length != 8 || s.length == 0)
            return false;
        for (String str: s) {
            if (str.length() > 4 || str.length() == 0)
                return false;
            if (str.charAt(0) == '-')
                return false;
            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if (!(Character.isDigit(c) || (c-'a'>=0 && c-'a'<6) || (c-'A'>=0 && c-'A'<6)))
                    return false;
            }
        }
        return true;
    }
}
