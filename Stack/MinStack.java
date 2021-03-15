package Stack;

import java.util.*;
/*
Question link: https://leetcode.com/problems/min-stack/
 */
public class MinStack {
    /** initialize your data structure here. */


    ArrayList<Integer> list;
    ArrayList<Integer> list2;
    public MinStack() {
        this.list = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
        list2.add(x);
    }

    public void pop() {
        int top = list2.get(list2.size() - 1);
        list.remove(list.indexOf(top));
        list2.remove(list2.size() - 1);
    }

    public int top() {

        return list2.get(list2.size() - 1);
    }

    public int getMin() {

        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {

        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        System.out.println(minstack.getMin());
        minstack.pop();
        System.out.println(minstack.top());
        System.out.println(minstack.getMin());

    }
}
