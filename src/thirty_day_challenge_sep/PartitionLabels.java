package thirty_day_challenge_sep;

import javafx.util.Pair;

import java.util.*;

public class PartitionLabels {

    public static class Partition {
        int start;
        int end;
        int size;

        public Partition(int start, int end, int size) {
            this.size = size;
            this.start = start;
            this.end = end;
        }
    }

    public List<Integer> partitionLabels(String S) {
        int[] start = new int[26];
        int[] end = new int[26];
        int[] count = new int[26];

        Arrays.fill(start, -1);
        Arrays.fill(end, -1);

        int n = S.length();
        for (int i=0; i<n; i++) {
            if (start[S.charAt(i)-'a'] == -1) {
                start[S.charAt(i)-'a'] = i;
                end[S.charAt(i)-'a'] = i;
                count[S.charAt(i)-'a']++;
            } else {
                end[S.charAt(i)-'a'] = i;
                count[S.charAt(i)-'a']++;
            }
        }

        List<Partition> segs = new ArrayList<>();
        for (int i=0; i<26; i++) {
            if (start[i] != -1) {
                segs.add(new Partition(start[i], end[i], count[i]));
            }
        }

        Collections.sort(segs, Comparator.comparingInt(seg -> seg.start));

        Stack<Pair<Integer, Integer>> s= new Stack<>();
        s.push(new Pair<>(segs.get(0).start, segs.get(0).end));
        Stack<Integer> partitionSizes = new Stack<>();
        partitionSizes.push(segs.get(0).size);

        n = segs.size();
        for (int i=1; i<n; i++) {
            Partition seg = segs.get(i);
            Pair<Integer, Integer> prevSeg = s.peek();
            if (seg.start < prevSeg.getValue()) {
                s.pop();
                int prevSize = partitionSizes.pop();

                s.push(new Pair<>(prevSeg.getKey(), Math.max(prevSeg.getValue(),seg.end)));
                partitionSizes.push(prevSize + seg.size);
            } else if (seg.start > prevSeg.getValue()) {
                s.push(new Pair<>(seg.start, seg.end));
                partitionSizes.push(seg.size);
            }
        }

        return new ArrayList<>(partitionSizes);
    }
}
