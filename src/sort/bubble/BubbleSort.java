package sort.bubble;

import sort.Utils;

/**
 * 冒泡排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class BubbleSort {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    Utils.swap(nums, j, j + 1);
                }
            }
        }
    }
}
