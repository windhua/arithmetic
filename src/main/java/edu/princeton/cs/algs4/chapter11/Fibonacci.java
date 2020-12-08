package edu.princeton.cs.algs4.chapter11;

import edu.princeton.cs.algs4.StdOut;

/**
 * 斐波那契数列:后一项是前俩项之和
 */

public class Fibonacci {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long Fib(int N) {
        long[] f = new long[N + 1];
        return Fib(N, f);
    }

    public static long Fib(int N, long[] f) {
        if (f[N] == 0) {
            if (N == 1)
                f[N] = 1;
            else if (N > 1)
                f[N] = Fib(N - 1, f) + Fib(N - 2, f);
        }

        return f[N];
    }

    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + Fib(N));
    }

}