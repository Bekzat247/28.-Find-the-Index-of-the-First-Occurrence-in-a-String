package org.example;

public class Main {
    static void main() {
        Solution solution = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(solution.strStr(haystack, needle));

    }
}
class Solution {
    public int strStr(String haystack, String needle){
        String[] initArr = haystack.split("");
        String[] secondArr = needle.split("");
        int neededIndex = -1;
        for (int i = 0; i < initArr.length; i++) {
            if (initArr.length - i  < secondArr.length) break;
            for (int j = 0; j < secondArr.length; j++) {
                if (initArr[j+i].equals(secondArr[j]) && j == secondArr.length-1){
                    neededIndex = i;
                }
                if(!initArr[i + j].equals(secondArr[j]))break;
            }
            if (neededIndex != -1) break;
        }
        return neededIndex;
    }
}