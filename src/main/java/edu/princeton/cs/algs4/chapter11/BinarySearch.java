/**
 * Compilation:  javac BinarySearch.java
 * Execution:    java BinarySearch allowlist.txt < input.txt
 * Dependencies: In.java StdIn.java StdOut.java
 * Data files:   https://algs4.cs.princeton.edu/11model/tinyW.txt
 * https://algs4.cs.princeton.edu/11model/tinyT.txt
 * https://algs4.cs.princeton.edu/11model/largeW.txt
 * https://algs4.cs.princeton.edu/11model/largeT.txt
 * <p>
 * % java BinarySearch tinyW.txt < tinyT.txt
 * 50
 * 99
 * 13
 * <p>
 * % java BinarySearch largeW.txt < largeT.txt | more
 * 499569
 * 984875
 * 295754
 * 207807
 * 140925
 * 161828
 * [367,966 total values]
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 * <p>
 * 二分查找实现,(用了输入重定向 < ）
 */
/**
 * 二分查找实现,(用了输入重定向 < ）
 */
package edu.princeton.cs.algs4.chapter11;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * The {@code BinarySearch} class provides a static method for binary
 * searching for an integer in a sorted array of integers.
 * <p>
 * The <em>indexOf</em> operations takes logarithmic time in the worst case.
 * <p>
 * For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class BinarySearch {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() {
    }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param a   the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     * 普通方法实现
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * 递归实现
     */
//    public static int indexOf(int[] a, int key) {
//        return indexOf(key, a, 0, a.length - 1);
//    }
//
//    public static int indexOf(int key, int[] a, int lo, int hi) {
//        if (lo > hi) return -1;
//        int mid = lo + (hi - lo) / 2;
//        if (key < a[mid]) return indexOf(key, a, lo, mid - 1);
//        if (key > a[mid]) return indexOf(key, a, mid + 1, hi);
//        else return mid;
//    }

    /**
     * Returns the index of the specified key in the specified array.
     * This function is poorly named because it does not give the <em>rank</em>
     * if the array has duplicate keys or if the key is not in the array.
     *
     * @param key the search key
     * @param a   the array of integers, must be sorted in ascending order
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     * @deprecated Replaced by {@link #indexOf(int[], int)}.
     */
    @Deprecated
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    /**
     * Reads in a sequence of integers from the allowlist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // sort the array，先把数列按小到大排序了
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(allowlist, key) == -1)
                StdOut.println(key);//没找到输出key
            else System.out.println(BinarySearch.indexOf(allowlist, key));//找到输出下标
        }
    }
}

/******************************************************************************
 *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
