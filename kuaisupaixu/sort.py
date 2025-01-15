def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    
    # 选择基准值（这里选择第一个元素作为基准）
    pivot = arr[0]
    
    # 分区操作
    left = [x for x in arr[1:] if x <= pivot]    # 小于等于基准的元素
    right = [x for x in arr[1:] if x > pivot]    # 大于基准的元素
    
    # 递归排序左右两部分
    return quick_sort(left) + [pivot] + quick_sort(right)

# 使用示例
if __name__ == "__main__":
    # 测试数组
    test_array = [64, 34, 25, 12, 22, 11, 90]
    sorted_array = quick_sort(test_array)
    print("排序前:", test_array)
    print("排序后:", sorted_array)
