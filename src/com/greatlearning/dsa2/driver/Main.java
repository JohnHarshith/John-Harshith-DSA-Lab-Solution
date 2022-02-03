package com.greatlearning.dsa2.driver;

import java.util.*;

public class Main {
    static class Node {
        Node left;
        Node right;
        int data;
    };
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static ArrayList<Integer> tracePath(Node root) {
        if(root == null) {
            ArrayList<Integer> output = new ArrayList<>();
            return output;
        }
        ArrayList<Integer> right = tracePath(root.right);
        ArrayList<Integer> left = tracePath(root.left);
        if(right.size() < left.size()) 
            left.add(root.data);
        else
            right.add(root.data);
        return (left.size() > right.size() ? left:right);
    }
    public static void main(String[] args) {
        Node root = newNode(100);
        root.left = newNode(20);
        root.right = newNode(130);
        root.left.left = newNode(10);
        root.left.right = newNode(50);
        root.right.left = newNode(110);
        root.right.right = newNode(140);
        root.left.left.left = newNode(5);
        ArrayList<Integer> path = tracePath(root);
        int n = path.size();
        System.out.println();
        System.out.print("Longest path: ");
        System.out.print(path.get(n-1));
        for(int i=(n-2); i>=0; i--) {
            System.out.print(" -> " + path.get(i));
        }
        System.out.println("\n");
    }
}
