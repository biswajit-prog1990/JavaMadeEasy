package co.java.basicprograms.sortingalgorithms;

import java.util.*;

class Solution{
    private static void getSeriesResult(int a, int b, int n) {
        //To find the series (a+2^n*b) till n-1
        int sN = 0;
        for(int i=0; i<n; i++) {
            sN += Math.pow(2, i) * b;
            System.out.print((sN + a) + " ");
        }
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getSeriesResult(a, b, n);
            System.out.println();
        }
        in.close();
    }
}