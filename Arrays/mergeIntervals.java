package arrays;
/*
Question link: https://leetcode.com/problems/merge-intervals/
 */
import java.util.*;

public class mergeIntervals {


    public int[][] merge(int[][] intervals) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int x1 = intervals[0][0];
        int y1 = intervals[0][1];
        int si = 1;
        List<Integer> merged = new ArrayList<>();
        merged.add(x1);
        merged.add(y1);
        list.add(merged);

        int newx = 0, newy = 0;
        while(si < intervals.length){

            int x2 = intervals[si][0];
            int y2 = intervals[si][1];
            merged = new ArrayList<>();

            //if overlapping
            if(y1 > x2 || y1 == x2){
                newx = Math.min(x1,x2);
                newy = Math.max(y1,y2);
                list.remove(list.size() - 1);
            }

            //if not overlapping
            else{
                newx = x2;
                newy = y2;
            }

            merged.add(newx);
            merged.add(newy);
            x1 = newx;
            y1 = newy;
            list.add(merged);
            si++;
        }

        int ans[][]  = new int [list.size()][2];
        int ji = 0;
        for(List<Integer> l : list){
            for(int i = 0; i<l.size(); i++){
                Integer num = l.get(i);
                ans[ji][i] = num.intValue();
            }
            ji++;
        }

        return ans;
    }

    public static void main(String[] args) {

        mergeIntervals finder = new mergeIntervals();
        int a[][] = {{1,3},{2,6},{8,10},{15,18}};
        int[][]ans = finder.merge(a);

        System.out.print("[");
        for(int ax[] : ans){
            System.out.print("[");
            for(int num : ax){
                System.out.print(num + ",");
            }
            System.out.print("],");
        }
        System.out.print("]");

    }
}
