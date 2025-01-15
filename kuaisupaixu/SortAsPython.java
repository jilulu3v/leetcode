package kuaisupaixu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAsPython {
    public List<Integer> quickSort(List<Integer> arr) {
        // 基本情况：如果数组长度小于等于1，直接返回
        if (arr.size() <= 1) {
            return arr;
        }
        
        // 选择基准值（第一个元素）
        Integer pivot = arr.get(0);
        
        // 创建左右子数组
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        // 分区操作
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }
        
        // 递归排序左右两部分并合并结果
        List<Integer> result = new ArrayList<>();
        result.addAll(quickSort(left));
        result.add(pivot);
        result.addAll(quickSort(right));
        
        return result;
    }

    // 测试代码
    public static void main(String[] args) {
        // 创建测试数组
        List<Integer> arr = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        
        System.out.println("排序前：" + arr);
        
        SortAsPython sorter = new SortAsPython();
        List<Integer> sortedArray = sorter.quickSort(new ArrayList<>(arr));
        
        System.out.println("排序后：" + sortedArray);
    }
} 