package search.binary;

/**
 * memo
 *
 * @author: jiancong
 * @date: 2020/9/24
 */
public class BinarySearch {

    /**
     * 二分查找(非递归)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找(递归)
     *
     * @param nums
     * @param target
     * @param l
     * @param r      r初始值为nums.length-1
     * @return
     */
    public static int binarySearch(int[] nums, int target, int l, int r) {
        int mid;
        if (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, r);
            } else {
                return binarySearch(nums, target, l, mid - 1);
            }
        }
        return -1;
    }

    /**
     * 寻找左侧边界的二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch_1(int nums[], int target) {
        if (nums == null) {
            return -1;
        }
        int l = 0;
        int r = nums.length;
        int mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                r = mid;
            } else if (nums[mid] > target) {
                r = mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
        }
        return l;
    }

    /**
     * 寻找右侧边界的二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch_2(int nums[], int target) {
        if (nums == null) {
            return -1;
        }
        int l = 0;
        int r = nums.length;
        int mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
        }
        return l-1;
    }
}
