package dp;

import java.util.Arrays;
import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = mapStringToStack(S);
        Stack<Character> t = mapStringToStack(T);
        Character[] sChar = new Character[s.size()];
        s.toArray(sChar);
        Character[] tChar = new Character[t.size()];
        t.toArray(tChar);
        return Arrays.equals(sChar,tChar);
    }

    private Stack<Character> mapStringToStack(String S) {
        Stack<Character> s = new Stack<>();
        for (int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '#') {
                if (!s.isEmpty())
                    s.pop();
            } else
                s.add(S.charAt(i));
        }
        return s;
    }
}
