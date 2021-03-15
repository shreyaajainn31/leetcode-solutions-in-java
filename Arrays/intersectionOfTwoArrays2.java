package arrays;
import java.util.*;

/*
Question link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */

public class intersectionOfTwoArrays2 {

    private void countFrequencies(Map<Integer,Integer> map, int[]nums){

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {


        int[] arr = new int[0];
        if(nums2.length == 0){
            return arr;
        }

        if(nums1.length == 0){
            return arr;
        }

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        countFrequencies(map1, nums1);
        countFrequencies(map2, nums2);

        ArrayList<Integer>list = new ArrayList<>();

        for(int num : map1.keySet()){
            if(map2.containsKey(num)){
                if(map1.get(num) == map2.get(num)){
                    for(int i = 0; i<map1.get(num); i++){
                        list.add(num);
                    }
                }
                else{
                    for(int i = 0; i<Math.min(map1.get(num), map2.get(num)); i++){
                        list.add(num);
                    }
                }
            }
        }


        int[]ans = new int[list.size()];
        int ai = 0;

        for(int num : list){
            ans[ai++] = num;
        }

        return ans;
    }
    public static void main(String[] args) {

        intersectionOfTwoArrays2 inter = new intersectionOfTwoArrays2();
        int[]nums1 = {1,2,2,1};
        int []nums2 = {2,2};
        System.out.println(Arrays.toString(inter.intersect(nums1,nums2)));

    }

}
