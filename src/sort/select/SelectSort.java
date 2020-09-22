package sort.select;

import sort.Utils;

/**
 * 选择排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class SelectSort {

    public static void selectSort(int[] nums) {
        int k, j;
        for (int i = 0; i < nums.length - 1; i++) {
            k = i;
            j = i + 1;
            for (; j < nums.length; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            if (k != i) {
                Utils.swap(nums, k, i);
            }
        }
    }
}
