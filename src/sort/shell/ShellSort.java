package sort.shell;

/**
 * 希尔排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class ShellSort {

    public static void shellSort(int[] nums) {
        int d = nums.length / 2;
        for (; d > 0; d = d / 2) {
            for (int i = d; i < nums.length; i = i + d) {
                int j = i - d;
                int tmp = nums[i];
                for (; j >= 0 && tmp < nums[j]; j = j - d) {
                    nums[j + d] = nums[j];
                }
                nums[j + d] = tmp;
            }
        }
    }
}
