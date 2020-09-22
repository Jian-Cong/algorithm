package sort;

/**
 * memo
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class Utils {
    public static void swap(int[] nums, int l, int r) {
        if (l != r) {
            nums[l] ^= nums[r];
            nums[r] ^= nums[l];
            nums[l] ^= nums[r];
        }
    }
}
