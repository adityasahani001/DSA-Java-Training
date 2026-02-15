// Optimal
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] prev = intervals[0];

        for(int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if(next[0] <= prev[1]) {
              prev[1] = Math.max(prev[1], next[1]);
            } else {
                merged.add(prev);
                prev = next;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}
