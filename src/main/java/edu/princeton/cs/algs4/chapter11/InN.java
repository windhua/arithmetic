package edu.princeton.cs.algs4.chapter11;

/**
 * ln（N）的实现
 */
public class InN {
    public static double ln(int N) {
        if (N == 1 || N == 0) return 0;
        else return ln(N - 1) + Math.log(N);//Java中Math.log()默认以e为底
    }

    public static void main(String[] args) {
        System.out.println(ln(3)); //ln(6)的阶乘
    }
}
