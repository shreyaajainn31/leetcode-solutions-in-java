package arrays;

/*
You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

Define a pair (u,v) which consists of one element from the first array and one element from the second array.

Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.

Example 1:

Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence:
             [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:

Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [1,1],[1,1]
Explanation: The first 2 pairs are returned from the sequence:
             [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
Example 3:

Input: nums1 = [1,2], nums2 = [3], k = 3
Output: [1,3],[2,3]
Explanation: All possible pairs are returned from the sequence: [1,3],[2,3]
Question link: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
 */
import java.util.*;

public class findKPairsWithSmallestSums {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>>ans = new ArrayList<>();


        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){

            @Override
            public int compare(int [] o1, int[]o2){
                int x1 = o1[0];
                int y1 = o1[1];
                int x2 = o2[0];
                int y2 = o2[1];

                return Integer.compare(x1+y1, x2+y2);
            }
        });

        for(int i =  0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){

                int[] x = new int[2];
                x[0] = nums1[i];
                x[1] = nums2[j];
                pq.add(x);
            }
        }

        while(k!=0 && !pq.isEmpty()){

            List<Integer> list = new ArrayList<>();
            list.add(pq.peek()[0]);
            list.add(pq.peek()[1]);
            ans.add(list);
            pq.poll();
            k--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[]nums1 = {1,7,11};
        int[]nums2 = {2,4,6};

        System.out.println(kSmallestPairs(nums1,nums2,3));
    }


}
