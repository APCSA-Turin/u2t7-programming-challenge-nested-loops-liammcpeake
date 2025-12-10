package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
        
public static String starStaircase(int height){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= height; i++) {
        for (int j = 0; j < i; j++) {
            sb.append("*");
        }
        sb.append("\n");
        
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.deleteCharAt(0);
    String result = (sb.toString());
    return result;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String reverseStairs= "";
    for (int i = height; i >= 1; i--) {
        for (int j = 0; j < i; j++) {
            reverseStairs +="*";
        }
        reverseStairs +="\n";
    }
        reverseStairs = reverseStairs.trim();
        return reverseStairs;
    
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        if (width == 1 || height == 1) {
            return "";
        }
        return sb.toString();
        
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < len; j++) {
                sb.append(word.charAt((i + j) % len));
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
        
    }

}