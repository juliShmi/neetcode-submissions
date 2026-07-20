/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) return true;

        Collections.sort(intervals, (a, b) -> a.start - b.start);
        for (int i = 0; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (i + 1 == intervals.size()) break;
            Interval next = intervals.get(i+1);
            if (current.end > next.start) return false;

        }
        return true;
    }
}
