package org.example;

public class Main {
    static void main() {
        String haystack = "sadbutsad";
        String needle = "sad";
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
        System.out.println(neededIndex);
    }
}
