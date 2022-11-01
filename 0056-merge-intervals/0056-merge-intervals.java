class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 1){
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> output_interval = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_interval.add(current_interval);
        
        for(int[] inter : intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = inter[0];
            int next_end = inter[1];
            if(current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            }
            else{
                current_interval = inter;
                output_interval.add(current_interval);
            }
        }
        return output_interval.toArray(new int[output_interval.size()][]);
    }
}

