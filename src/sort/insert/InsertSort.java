package sort.insert;

/**
 * 插入排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class InsertSort {

    public static void insertSort(int[] nums) {
        int tmp;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            tmp = nums[i];
            for (; j >= 0 && tmp < nums[j]; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = tmp;
        }
    }
}
