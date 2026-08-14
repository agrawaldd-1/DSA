import java.util.*;

class Main {

    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort by starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 2: Traverse intervals
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Overlap
            if (nextStart <= end) {
                end = Math.max(end, nextEnd);
            }

            // No overlap
            else {
                result.add(new int[]{start, end});

                start = nextStart;
                end = nextEnd;
            }
        }

        // Add last interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] array = {
            {4,7},{1,4}
        };

        System.out.println(
            Arrays.deepToString(merge(array))
        );
    }
}