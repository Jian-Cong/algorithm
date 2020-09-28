package sort.insert;

/**
 * 插入排序
 * <p>
 * 思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置，直到全部插入排序完为止
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class InsertSort {

    /**
     * 直接插入排序
     * @param nums
     */
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

    /**
     * 二分插入排序
     * TimSort.java的二分排序
     *
     * @param nums
     */
    public static void halfInsertSort(int[] nums) {
        int tmp;
        for (int i = 1; i < nums.length; i++) {
            tmp = nums[i];
            int pos = position(nums, 0, i - 1, tmp);
//            int j = i;
//            while (j > pos) {
//                nums[j] = nums[j - 1];
//                j--;
//            }
            System.arraycopy(nums,pos,nums,pos+1,i-pos);
            nums[pos] = tmp;
        }
    }

    /**
     * 查找待排序值在有序数组中的位置
     * @param nums
     * @param l
     * @param r
     * @param target
     * @return
     */
    public static int position(int[] nums, int l, int r, int target) {
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {33,11,9,21,11,9,34,1};
        insertSort(nums);
        for(int num:nums){
            System.out.println(num);
        }
    }
}
