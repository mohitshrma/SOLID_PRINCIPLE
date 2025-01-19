package org.example.LiskovSubstituitionPrinciple;

public class Solution {
    public static void main(String[] args) {
        Bird[] birds = { new Sparrow(), new Penguin() };
        for (Bird b : birds) {
            System.out.println(b.move());
        }
    }
}

