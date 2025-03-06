package com.larrykin.classwork.leetCode;

/*There are two sorted arrays A and B of size m and n respectively. Find the median of the
 two sorted arrays. The overall run time complexity should be O(log (m+n)).*/
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 4, 5, 6, 7};
        int[] B = new int[]{1, 3, 5, 6, 7, 8, 9};

        int m = A.length;
        int n = B.length;

        if ((m + n) % 2 != 0) { //odd
            System.out.println("Odd");
            double result = findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
            System.out.println(result);
        } else { //even
            System.out.println("Even");
            double result = (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) + findKth(A, B, (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
            System.out.println(result);
        }
    }

    public static double findKth(int[] A, int[] B, int k, int aStart, int aEnd, int bStart, int bEnd) {

        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;

        //handle special cases
        if (aLen == 0) return B[bStart + k];
        if (bLen == 0) return A[aStart + k];
        if (k == 0) return Math.min(A[aStart], B[bStart]);

        int aMid = aLen * k / (aLen + bLen); // a's middle count.
        int bMid = k - aMid - 1; // b's middle count.

        //make aMid and bMid to be array index
        aMid = aEnd + aStart;
        bMid = bMid + bStart;

        if (A[aMid] > B[bMid]) {
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;
        } else {
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }

        return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
    }
}
