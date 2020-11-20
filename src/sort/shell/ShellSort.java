package sort.shell;

import sort.quick.QuickSort;

import java.io.*;
import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class ShellSort {

    public static void shellSort(int[] nums) {
        int gap = nums.length / 2;
        int tmp;
        int j;
        for (; gap > 0; gap = gap / 2) {
            for (int i = gap; i < nums.length; i++) {
                j = i - gap;
                tmp = nums[i];
                for (; j >= 0 && tmp < nums[j]; j = j - gap) {
                    nums[j + gap] = nums[j];
                }
                nums[j + gap] = tmp;
            }
        }
    }

    /**
     * 间隔取(2^n)-1
     * @param nums
     */
    public static void shell(int[] nums){
        int gapLength = getLength(nums.length);
        long l = System.currentTimeMillis();
        int tmp;
        int j;
        int gap;
        for (; gapLength>0; gapLength--) {
            gap = (2^gapLength)-1;
            for (int i = gap; i < nums.length; i++) {
                j = i - gap;
                tmp = nums[i];
                for (; j >= 0 && tmp < nums[j]; j = j - gap) {
                    nums[j + gap] = nums[j];
                }
                nums[j + gap] = tmp;
            }
        }
        System.out.println("cost2:"+(System.currentTimeMillis()-l));
    }

    public static int getLength(int length){
        int len=1;
        int i=1;
        for(;len<length;i++){
            len = (int)(Math.pow(2,i))-1;
        }
        return i;
    }

    public static void main(String[] args) throws IOException {
        /*String prefix = "";
        String[] fileName = {"1k","1w","10w","100w","1000w"};
        for(String name:fileName) {
            System.out.println(name+"数据量");
            File file = new File(""+prefix+name+".txt");
            FileInputStream fr = new FileInputStream(file);
            StringBuilder sb = new StringBuilder();
            byte[] bt = new byte[1024];
            int len;
            while ((len = (fr.read(bt))) != -1) {
                sb.append(new String(bt, 0, len));
            }
            String[] s = sb.toString().split(",");
            int[] org = new int[s.length];
            int[] nums1 = new int[s.length];
            int[] nums2 = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                org[i] = Integer.valueOf(s[i]);
            }
            System.arraycopy(org, 0, nums1, 0, org.length);
            System.arraycopy(org, 0, nums2, 0, org.length);
            long l = System.currentTimeMillis();
            shellSort(nums1);
            System.out.println("shell cost:" + (System.currentTimeMillis() - l));
            l = System.currentTimeMillis();
            QuickSort.quickSort(nums2, 0, nums2.length - 1);
            System.out.println("quick cost:" + (System.currentTimeMillis() - l));
            l = System.currentTimeMillis();
            Arrays.sort(nums2);
            System.out.println("Arrays cost:" + (System.currentTimeMillis() - l));
        }*/
    }
}
