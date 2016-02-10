package com.thoughtworks.tw101.exercises.exercise9;

import java.util.*;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if(this.name == null) {
            new Node(nameOfNewNode);
        } else {
            if(nameOfNewNode.compareTo(this.name) < 0) {
                this.left.add(nameOfNewNode);
            } else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> namesList = new ArrayList<String>();
        if(this.name == null) {
            return namesList;
        } else {
            namesList.addAll(this.left.names());
            namesList.add(this.name);
            namesList.addAll(this.right.names());
        }
        return namesList;
    }
}
