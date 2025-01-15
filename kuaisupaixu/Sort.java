package kuaisupaixu;

public class Sort {
    public void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }
    
    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // 获取分区点
            int pivot = partition(arr, left, right);
            // 递归排序左半部分
            quickSort(arr, left, pivot - 1);
            // 递归排序右半部分
            quickSort(arr, pivot + 1, right);
        }
    }
    
    private int partition(int[] arr, int left, int right) {
        // 选择最右边的元素作为基准值
        int pivot = arr[right];
        int i = left - 1;
        
        // 将小于基准值的元素移到左边
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // 将基准值放到正确的位置
        swap(arr, i + 1, right);
        return i + 1;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 测试代码
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("排序前：");
        printArray(arr);
        
        Sort sorter = new Sort();
        sorter.quickSort(arr);
        
        System.out.println("排序后：");
        printArray(arr);
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
