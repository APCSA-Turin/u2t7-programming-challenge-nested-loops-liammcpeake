package com.example.project;

public class NestedLoopsRunner {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= 5; i++) {
        for (int j = 0; j < i; j++) {
            sb.append("*");
        }
        sb.append("\n");
        
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(0);
    System.out.println(sb.toString());
    }
}

  