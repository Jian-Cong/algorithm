package sort.count;

/**
 * 计数排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class CountSort {

    public static void countSort(int[] nums, int max) {
        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                nums[idx++] = i;
                count[i]--;
            }
        }
    }
}
