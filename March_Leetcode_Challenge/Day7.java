package March_Leetcode_Challenge;
/*
Question link: https://leetcode.com/problems/design-hashmap/

 */
public class Day7 {

    static class MyHashMap {

        /** Initialize your data structure here. */
        int[] hashmap;

        public MyHashMap() {
            this.hashmap = new int[1000000];
            for(int i =0; i<1000000; i++) hashmap[i] = -1;
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            hashmap[key] = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            return hashmap[key];
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            hashmap[key] = -1;
        }
    }

    public static void main(String[] args) {
        MyHashMap hashmap = new MyHashMap();
        hashmap.put(1,1);
        hashmap.put(2,2);
        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(3));
        hashmap.put(2,1);
        System.out.println(hashmap.get(2));
        hashmap.remove(2);
        hashmap.get(2);

    }

}
