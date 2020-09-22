package sort.mergesort;

/**
 * 归并排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class MergeSort {

    public static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int p = (l + r) >> 1;
            mergeSort(nums, l, p);
            mergeSort(nums, p + 1, r);
            merge(nums, l, p, r);
        }
    }

    public static void merge(int[] nums, int l, int p, int r) {
        // 复制数组长度+1，简化合并操作
        int[] A = new int[p - l + 1 + 1];
        int[] B = new int[r - p + 1];
        System.arraycopy(nums, l, A, 0, A.length - 1);
        A[A.length - 1] = Integer.MAX_VALUE;
        System.arraycopy(nums, p + 1, B, 0, B.length - 1);
        B[B.length - 1] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (; l <= r; l++) {
            if (A[i] <= B[j]) {
                nums[l] = A[i++];
            } else {
                nums[l] = B[j++];
            }
        }
    }
}
