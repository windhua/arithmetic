package edu.princeton.cs.algs4.chapter11;

/**
 * 素数判断
 */
public class judgeSushu {
    static Boolean Sushu(int N) {
        if (N < 2) return false;//1不是素数
        for (int i = 2; i * i <= N; i++)//要是有因子必然是一个大于i一个小于i，在此结束节约内存
            if (N % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Sushu(1));
    }
}

